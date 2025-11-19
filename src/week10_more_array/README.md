# Úlohy - Pole

## Zaměstnanci
2 pole:
- přijmění,
- platy.

> [!note]
> Ženy: `ová`

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

## 6.9 - Kasa vrací bankovky
Zapište program, který pro zadanou sumu v korunách vypíše výčetku platidel – tj. počet a hodnoty bankovek,
kterými lze zadanou částku zaplatit. Hodnoty jednotlivých platidel nechť jsou sestupně zařazeny do pole – pro
vytvoření pole použijte statický inicializátor.

```java
final int[] p = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
```

## 6.7 
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

Očekáváme kladná čísla typu long.

> [!note]
> Pole má pevnou velikost, ale uživatel může zadat méně čísel než je velikost pole. V takovém případě je třeba pole zmenšit na skutečný počet zadaných čísel (realokace). Pokud uživatel zadá více čísel než je velikost pole, je třeba pole zvětšit (realokace).