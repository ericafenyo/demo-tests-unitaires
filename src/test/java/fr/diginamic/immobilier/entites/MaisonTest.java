package fr.diginamic.immobilier.entites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaisonTest {
  private Maison maison;

  @Before()
  public void setup() {
    maison = new Maison();

    // First floor
    var restroom = new Salon(1, 20);
    var kitchen = new Cuisine(1, 10);
    var bathroom = new SalleDeBain(1, 5);
    var washroom = new WC(1, 5);

    maison.ajouterPiece(restroom);
    maison.ajouterPiece(kitchen);
    maison.ajouterPiece(bathroom);
    maison.ajouterPiece(washroom);

    // Second floor
    var bedroom = new Chambre(2, 15);
    var masterBathroom = new SalleDeBain(2, 5);
    var masterWashroom = new WC(2, 5);

    maison.ajouterPiece(bedroom);
    maison.ajouterPiece(masterBathroom);
    maison.ajouterPiece(masterWashroom);
  }

  @Test
  public void superficieEtage() {
    // Ist floor surface area (20 + 10 + 5 + 5)
    Assert.assertEquals(40.0, maison.superficieEtage(1), 0);

    // Second floor surface area (15 + 5 + 5)
    Assert.assertEquals(25.0, maison.superficieEtage(2), 0);
  }

  @Test
  public void superficieTypePiece() {
    // TYPE_SDB = 5 + 5
    Assert.assertEquals(10.0, maison.superficieTypePiece(Piece.TYPE_SDB), 0);
  }

  @Test
  public void calculerSurface() {
    // Surface = 40 + 25
    Assert.assertEquals(65.0, maison.calculerSurface(), 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void ajouterNullPiece() {
    var m = new Maison();
    m.ajouterPiece(null);
  }
}