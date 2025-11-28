# Úlohy - Členění kódu 

Členění kódu, menší jednotky – jednodušší kompetence. Strukturovaný/hierarchický návrh. Vyhýbáme se opakování
kódu. Návrh a použití vlastních metod. Více tříd v programu, knihovní třída.

- [Úlohy - Členění kódu](#úlohy---členění-kódu)
  - [4. VectorTools](#4-vectortools)
  - [5. DateTimeTools](#5-datetimetools)
  - [9. MathTools](#9-mathtools)

## 4. VectorTools

Vytvořte knihovní třídu **VectorTools** pro manipulaci s 3D vektory – s metodami pro délku vektoru, skalární součin, úhel, test rovnoběžnosti, test kolmosti dvou vektorů, délku vektorového součinu (tj. délku vektoru, který je výsledkem vektorového součinu dvou vektorů). Kód metod/testů zapište bez použití logického příkazu. Při testování nezapomeňte na nepřesné zobrazení reálných čísel.. 

Metodám doplňte dokumentační komentáře.
Vytvořte program, kterým otestujete implementované metody.

> [!tip] Délka vektoru (x, y, z):
- $\sqrt{x^2 + y^2 + z^2}$ - Pythagorova věta v 3D

> [!tip] Skalární součin vektorů (x1, y1, z1) a (x2, y2, z2):
- $x1*x2 + y1*y2 + z1*z2$

Vzorové hodnoty pro testování:
```java
System.out.println(vectorLength(1, 1, 1)); // 1.732
System.out.println(vectorLength(8, 1, 1)); // 8.124
System.out.println(vectorLength(5, 6, 18)); // 19.729
System.out.println(vectorLength(8, 4, 2)); // 9.165
```

## 5. DateTimeTools
Vytvořte knihovní třídu **DateTimeTools** s metodami pro:
- test přestupného roku;
- test platnosti zadaného data;
- test platnosti zadaného času;
- výpočet dne týdne pro zadaný den (použijte Zellerův algoritmus);
- určení počtu dní zadaného měsíce v konkrétním roce (výsledek 28, 29, 30 nebo 31);
- určení pořadí dne v rámci roku pro zadané datum;
- určení čísla týdne pro zadané datum;
- převod zadaného data a času na jedinou hodnotu v definovaném formátu (v různých variantách převod na
textový řetězec, celé číslo; prostředky pro obrácený převod.

Metodám doplňte dokumentační komentáře.
Vytvořte program, kterým otestujete implementované metody.

> [!note] Délky měsíců v roce:
- Leden – 31
- Únor – 28 (29 v přestupném roce)
- Březen – 31
- Duben – 30
- Květen – 31
- Červen – 30
- Červenec – 31
- Srpen – 31
- Září – 30
- Říjen – 31
- Listopad – 30
- Prosinec – 31

> [!note] Přestupný rok:
- Rok dělitelný 4 je přestupný 
  - Rok dělitelný 100 není přestupný
    - Rok dělitelný 400 je přestupný

## 9. MathTools
Doplňte třídu **MathTools** o metody pro výpočet některých z níže uvedených matematických funkcí pro zadané $x$ jako součtu řady. Výpočet proveďte se zadanou přesností. Hodnota $x$ a přesnost výpočtu $eps$ budou zadávány
jako parametry metody. Využití parametru eps v jednotlivých algoritmech – výpočet součtu ukončit v případě, že další člen řady je menší než požadovaná přesnost. Parametr `eps` v těchto případech představuje informaci
„na kolik platných desetinných míst má být výsledek vypočten“.

Následně doplňte obdobné metody s jedním parametrem `x`, tyto metody mají provést výpočet příslušné hodnoty (součtu řady) s „absolutní přesností“ (přesností na plný počet platných číslic odpovídajících možnostem typu `double`). Výpočet ukončit v případě, že přičtením dalšího členu nedošlo ke změně výsledné hodnoty.

Vytvořte testovací kód (program) ve kterém otestujete jednotlivé metody. Výsledek metody vždy porovnejte s hodnotou vypočtenou voláním odpovídající metody třídy Math jazyka Java.

```java
public static final float EPS = 0.000001f;
```

Přesnost výpočtu: konstantní hodnota zavedená v programu nebo (pro testování vhodněji) proměnná, jejíž hodnota bude zadaná uživatelem – přesnost musí být kladné číslo menší než 1 a udává počet platných desetinných míst výsledku. 

$$
cos(x) = \sum_{n=0}^{\infty} \frac{(-1)^n x^{2n}}{(2n)!}
$$

$$
\pi = 4 \sum_{n=0}^{\infty} \frac{(-1)^n}{2n+1}
$$

> [!tip]
Nezapomeň znormovat velikost úhlu v rozmezí 0 až 180 stupňů (nebo 0 až π radiánů).

> [!tip]
> Pokud implmentujete faktoriál jako samostatnou metodu, pamatujte na to, že faktoriál roste velmi rychle a pro větší hodnoty `n` již nepůjde výsledek uložit do proměnné typu `int` a je třeba použít typ `long`. 

Vzorové hodnoty pro testování:
```java
System.out.println("\nPocitame cosiny:");
// presnost zadana automaticky
System.out.println(cos(Math.PI / 2)); // 0
// presnost specifikovana argumentem
System.out.println(cos(Math.PI / 2, 0.00000001f)); // 0
System.out.println(Math.cos(Math.PI / 2)); // 0

System.out.println(cos(Math.PI)); // -1
System.out.println(Math.cos(Math.PI)); // -1

System.out.println(cos(Math.PI / 4)); // (2^1/2)/2
System.out.println(Math.cos(Math.PI / 4)); // (2^1/2)/2
```