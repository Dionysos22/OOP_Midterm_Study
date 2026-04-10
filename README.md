## OOP Midterm Study (Java)

Bu repo, **Deitel – Java How to Program (Early Objects)** slaytlarıyla paralel şekilde,
**Bölüm 1–6** konularını küçük, çalıştırılabilir Java örnekleriyle tekrar etmek için hazırlanmıştır.

### İçerik
- **`ch01/`**: Bölüm 1 (kavramsal özet + “test-drive” örneği)
- **`ch02/`**: Girdi/çıktı (`println/printf`), `Scanner`, operatörler, karşılaştırmalar (Welcome/Addition/Comparison)
- **`ch03/`**: Sınıflar-nesneler, instance variables, `set/get`, constructor, `double` balance, primitive vs reference
- **`ch04/`**: `if/else`, nested if, `while`, sayaç & sentinel kontrollü iterasyon, `++/--`, bileşik atama
- **`ch05/`**: `for`, `do-while`, `switch`, `break/continue`, mantıksal operatörler, String `switch` case study
- **`ch06/`**: Metotlar (parametre/return), scope, overloading, `SecureRandom` örnekleri

> Not: Bazı klasörlerde hem “slayt figürlerine yakın küçük örnekler” hem de “konu toplama” amaçlı
> `BolumX_*.java` dosyaları bulunabilir.

### Gereksinimler
- **Java JDK 8+** (tercihen 11+)
- Terminalde `javac` ve `java` komutlarının çalışması

### Derleme
Repo kök dizininde:

```bash
javac ch01/*.java ch02/*.java ch03/*.java ch04/*.java ch05/*.java ch06/*.java
```

### Çalıştırma
Paketli örnekler (ör. `package ch02;`) şu şekilde çalışır:

```bash
java -cp . ch02.Welcome1
java -cp . ch02.Addition
java -cp . ch03.AccountTest
java -cp . ch06.MaximumFinder
```

Chapter 1:

```bash
java -cp . ch01.Chapter1_Notes
java -cp . ch01.TestDrive merhaba 123
```

Default package olan (package satırı olmayan) `BolumX_*.java` dosyaları klasör içinde durduğu için
şu şekilde çalıştırılır:

```bash
java -cp ch02 Bolum2_Temeller
java -cp ch03 Bolum3_Siniflar
```

### Katkı
PR/issue açarak ek örnek önerebilirsin:
- yeni bir figür örneği
- daha fazla alıştırma
- yazım/format düzeltmeleri

### Lisans
Bu repo **ders çalışması** amaçlıdır. Slayt/kitap içeriğini birebir kopyalamak yerine,
örnekler **kavramları gösterecek şekilde** yeniden yazılmıştır.
