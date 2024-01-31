package fr.diginamic.enumerations;

import java.util.Arrays;
import java.util.Optional;

/**
 * Représente une saison et fournit les 4 instances de saisons.
 *
 * @author DIGINAMIC
 */
public enum Saison {

  /**
   * Les 4 instances de Saison
   */
  PRINTEMPS("Printemps", 1), ETE("Été", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

  /**
   * libelle
   */
  private String libelle;
  /**
   * ordre
   */
  private int ordre;

  /**
   * Constructeur
   *
   * @param libelle libellé
   * @param ordre   ordre
   */
  private Saison(String libelle, int ordre) {
    this.libelle = libelle;
    this.ordre = ordre;
  }

  /**
   * Permet de rechercher une Saison à partir de son libellé
   *
   * @param libelle libellé
   * @return {@link Saison}
   */
  public static Saison valueOfLibelle(String libelle) {
    return Arrays.stream(Saison.values())
        .filter(saison -> saison.libelle.equalsIgnoreCase(libelle))
        .findFirst()
        .orElse(null);
  }

  @Override
  public String toString() {
    return ordre + ". " + libelle;
  }

  /**
   * Getter
   *
   * @return the libelle
   */
  public String getLibelle() {
    return libelle;
  }

  /**
   * Getter
   *
   * @return the ordre
   */
  public int getOrdre() {
    return ordre;
  }
}