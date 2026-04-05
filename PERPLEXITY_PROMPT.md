<img src="https://r2cdn.perplexity.ai/pplx-full-logo-primary-dark%402x.png" style="height:64px;margin-right:32px"/>

# como coloco 2 casas decimais no preço em java?

Para mostrar um preço com 2 casas decimais em Java, as formas mais comuns são `String.format("%.2f", valor)` e `DecimalFormat("0.00")`; ambas formatam o número com duas casas após o separador decimal.[^1_1][^1_2][^1_3]

## Exemplo básico

Se você só quer exibir o valor com 2 casas, use assim:[^1_2][^1_1]

```java
double preco = 12.5;

System.out.println(String.format("%.2f", preco));
```

O especificador `%.2f` formata um número de ponto flutuante com 2 casas decimais.[^1_3][^1_2]

## Com DecimalFormat

Outra opção é usar `DecimalFormat`, com o padrão `"0.00"` para sempre manter duas casas, inclusive em valores como `12.5`, que vira `12.50`.[^1_4][^1_1]

```java
import java.text.DecimalFormat;

double preco = 12.5;
DecimalFormat df = new DecimalFormat("0.00");

System.out.println(df.format(preco));
```


## Preço em real

Se você quer formatar como moeda brasileira, use `NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))`, porque esse método retorna um formatador de moeda para o locale informado.[^1_5]

```java
import java.text.NumberFormat;
import java.util.Locale;

double preco = 12.5;
NumberFormat moedaBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

System.out.println(moedaBR.format(preco));
```

Se for para **exibir** preço, essas soluções resolvem bem; se for para cálculos financeiros, vale evitar depender de `double` e usar `BigDecimal`.[^1_1]
Você quer isso para `System.out`, interface gráfica, ou entrada de dados com `Scanner`?
<span style="display:none">[^1_10][^1_11][^1_12][^1_13][^1_14][^1_15][^1_16][^1_17][^1_18][^1_19][^1_20][^1_21][^1_22][^1_23][^1_24][^1_25][^1_26][^1_27][^1_28][^1_29][^1_6][^1_7][^1_8][^1_9]</span>

<div align="center">⁂</div>

[^1_1]: https://mkyong.com/java/java-display-double-in-2-decimal-points/

[^1_2]: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

[^1_3]: https://docs.oracle.com/javase/tutorial/essential/io/formatting.html

[^1_4]: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html

[^1_5]: https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html

[^1_6]: https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/

[^1_7]: https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java

[^1_8]: https://codingnconcepts.com/java/format-number-to-2-decimal-places/

[^1_9]: https://www.w3schools.com/java/ref_string_format.asp

[^1_10]: https://www.freeformatter.com/brazil-standards-code-snippets.html

[^1_11]: https://sentry.io/answers/round-a-number-to-n-decimal-places-in-java/

[^1_12]: https://www.geeksforgeeks.org/java/java-string-format-method-with-examples/

[^1_13]: https://stackoverflow.com/questions/49517897/parse-brl-currency-value-string-to-double

[^1_14]: https://attacomsian.com/blog/java-round-double-float

[^1_15]: https://techvidvan.com/tutorials/java-string-format-method/

[^1_16]: https://forums.oracle.com/ords/apexds/post/bean-write-and-brazilian-currency-format-4918

[^1_17]: https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat

[^1_18]: https://stackoverflow.com/questions/63821435/dont-quite-understand-string-format-and-the-java-documentation

[^1_19]: https://docs.oracle.com/javase/9/docs/api/java/text/class-use/NumberFormat.html

[^1_20]: https://forums.oracle.com/ords/apexds/post/custom-locale-question-3290

[^1_21]: https://coderanch.com/t/367272/java/java-text-NumberFormat-getCurrencyInstance-Locale

[^1_22]: http://stackoverflow.com/a/10826990/848668

[^1_23]: https://www.geeksforgeeks.org/java/numberformat-getcurrencyinstance-method-in-java-with-examples/

[^1_24]: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

[^1_25]: https://dev.to/beatrizmaciel/hackerrank-10-currency-formatter-22oj

[^1_26]: https://stackoverflow.com/questions/9777689/how-to-get-numberformat-instance-from-currency-code

[^1_27]: https://stackoverflow.com/questions/40226699/formatting-to-2-decimal-places-in-java

[^1_28]: https://www.guj.com.br/t/duvida-como-formatar-valores-para-moeda-corrente-em-java-resolvido/76580

[^1_29]: https://docs.oracle.com/javase/tutorial/i18n/format/numberFormat.html

