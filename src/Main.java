// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    double kcalFruchtjoghurt = 96;
    double fettFruchtjoghurt = 3;
    double eiweissFruchtjoghurt = 3;
    double preisFruchtjoghurt = 0.3;

    double kcalLightJoghurt = 60;
    double fettLightJoghurt = 1;
    double eiweissLightJoghurt = 4;
    double preisLightJoghurt = 0.5;

    double maxKcalProTag = 3000;
    double maxFettProTag = 90;
    double maxAusgabenProTag = 15;

    double maxFruchtjoghurtMenge = maxAusgabenProTag / preisFruchtjoghurt; // in Bechern
    double maxLightJoghurtMenge = maxAusgabenProTag / preisLightJoghurt; // in Bechern

    double maxKcalFruchtjoghurt = maxKcalProTag / kcalFruchtjoghurt * 100; // in Gramm
    double maxFettFruchtjoghurt = maxFettProTag / (fettFruchtjoghurt / 100); // in Gramm

    double maxKcalLightJoghurt = maxKcalProTag / kcalLightJoghurt * 100; // in Gramm
    double maxFettLightJoghurt = maxFettProTag / (fettLightJoghurt / 100); // in Gramm

    double maxEiweissFruchtjoghurt = maxKcalFruchtjoghurt / (kcalFruchtjoghurt / 100) * eiweissFruchtjoghurt / 100; // in Gramm
    double maxEiweissLightJoghurt = maxKcalLightJoghurt / (kcalLightJoghurt / 100) * eiweissLightJoghurt / 100; // in Gramm

    double empfohleneMengeFruchtjoghurt = Math.min(Math.min(maxFruchtjoghurtMenge, maxKcalFruchtjoghurt), Math.min(maxFettFruchtjoghurt, maxEiweissFruchtjoghurt));
    double empfohleneMengeLightJoghurt = Math.min(Math.min(maxLightJoghurtMenge, maxKcalLightJoghurt), Math.min(maxFettLightJoghurt, maxEiweissLightJoghurt));

    System.out.println("Empfohlene Tägliche Menge Fruchtjoghurt: " + empfohleneMengeFruchtjoghurt + " Gramm");
    System.out.println("Empfohlene Tägliche Menge Light-Joghurt: " + empfohleneMengeLightJoghurt + " Gramm");
    }
  }
