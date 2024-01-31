package fr.diginamic.enumerations;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SaisonTest {

  @Test
  public void testValueOfLibelle() {
    var values = List.of("Printemps", "Été", "Automne", "Hiver");

    values.forEach(value -> {
      var season = Saison.valueOfLibelle(value);
      Assert.assertNotNull(season);
    });

    Assert.assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
    Assert.assertEquals(Saison.ETE, Saison.valueOfLibelle("Été"));
    Assert.assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
    Assert.assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
  }

  @Test
  public void testBadLibelleArgument() {
    Assert.assertNull(Saison.valueOfLibelle(""));
    Assert.assertNull(Saison.valueOfLibelle(null));
    Assert.assertNull(Saison.valueOfLibelle("Foot"));
  }
}