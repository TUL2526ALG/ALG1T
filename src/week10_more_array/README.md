# Úlohy - Pole

- [Úlohy - Pole](#úlohy---pole)
  - [Zaměstnanci](#zaměstnanci)
  - [6.9 - Kasa vrací bankovky](#69---kasa-vrací-bankovky)
  - [6.7 Permutace](#67-permutace)
    - [Funkce:](#funkce)
    - [Kontrola permutací na poli vstupních čísel:](#kontrola-permutací-na-poli-vstupních-čísel)

## Zaměstnanci
2 pole:
- přijmění,
- platy.


Naprogramjtu funkce na zodpovězení následujících otázek:
- Kolikátý zaměstnanec na seznamu je `Černý`?
- Kolik bere `Novák`?
- Kdo bere nejvíc?
- Kolik zaplatíme na výplaty?
- Jaká je průměrná výplata?
- Kolik berou ženy průměrně?
- Kolik berou muži průměrně?
- Funkce která načte od uživatele pole zaměstnanců a jejich platů.
  - Zadejte počet zaměstnanců, poté jejich příjmení a platy.
  - Pro jednoduchost načítejte pouze příjmení zaměstnanců (bez jmen).

Vzorová data o zaměstnancích:
```java
// data o zaměstnancích
// Svobodová Novák Dvořáková Černý Malý Procházková
public final static String[] jmena = {
    "Svobodová",
    "Novák",
    "Dvořáková",
    "Černý",
    "Malý",
    "Procházková"
};

// 35000 42000 39000 45000 38000 41000
public final static int[] platy = {
    35000,
    42000,
    39000,
    45000,
    38000,
    41000
};
```

> [!tip]
> Při výpočtu průměru si dejte pozor na celočíselné dělení! Pokud dělíte dvěma celými čísly, výsledek bude také celé číslo (desetinná část se ztratí). Pro získání přesného výsledku je třeba alespoň jeden operand přetypovat na `double`.

> [!note]
> Ženy končí příjmením na `ová`.

```java
/**
 * Urci zda je zamestnanec zena podle prijmeni
 *
 * @param jmeno
 * @return true pokud je zena, false pokud je muz
 */
public static boolean isWoman(String jmeno) {
    return false;
}
```

> [!note]
> U funcí, které vracejí index zaměstnance v poli, vracejte `-1`, pokud zaměstnanec v poli není.

```java
/**
 * Najde zamestnance podle prijmeni
 *
 * @param jmena
 * @param prijmeni
 * @return index (-1 pokud nenalezen)
 */
public static int najdiZamestnance(String[] jmena, String prijmeni) {
    return -1;
}
```

## 6.9 - Kasa vrací bankovky
Zapište program, který pro zadanou sumu v korunách vypíše výčetku platidel – tj. počet a hodnoty bankovek,
kterými lze zadanou částku zaplatit. Hodnoty jednotlivých platidel nechť jsou sestupně zařazeny do pole – pro
vytvoření pole použijte statický inicializátor.

```java
final int[] p = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
```

## 6.7 Permutace
Zapište a otestujte metodu, které bude zjišťovat a poskytovat počty cifer pro hodnoty typu long předané jako parametr. 

Metodu použijte v programu, který bude testovat, zda zadaná čísla obsahují stejné cifry (zadaná čísla mohou být 2, může jich být ale i libovolně dlouhá sekvence).

### Funkce:
Počet stejných cifer v jednom číslu:

Pro číslo `2338`:
- 1*2
- 2*3
- 1*8

### Kontrola permutací na poli vstupních čísel:

Pro programy připravit funkci a také ošetření vstupů od u uživatele, realokace velikosti pole (na větší/menší).

Uživatel postupně zadává čísla, která chce porovnat. Zadávání ukončí enterem / prázdným vstupem.

Očekáváme kladná čísla typu `long`.

> [!note]
> Pole má pevnou velikost, ale uživatel může zadat méně čísel než je velikost pole. V takovém případě je třeba pole zmenšit na skutečný počet zadaných čísel (realokace). Pokud uživatel zadá více čísel než je velikost pole, je třeba pole zvětšit (realokace).