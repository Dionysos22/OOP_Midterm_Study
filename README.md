## Vize_Calisma

Bu klasörde Bölüm 2–6 konularını kapsayan örnek Java dosyaları var.

Ek olarak `ch02/`–`ch06/` alt klasörlerinde, slaytlardaki örneklere daha yakın olacak şekilde
konular küçük küçük `.java` dosyalarına bölünmüştür.

### Çalıştırma

Terminalde bu klasöre gel:

```bash
cd Vize_Calisma
```

Derle:

```bash
javac ch02/*.java ch03/*.java ch04/*.java ch05/*.java ch06/*.java
```

İstediğini çalıştır (örnek):

```bash
# Default package (package yazmayan) örnekleri:
java -cp ch02 Bolum2_Temeller
java -cp ch03 Bolum3_Siniflar
java -cp ch04 Bolum4_Kontrol1
java -cp ch05 Bolum5_Kontrol2
java -cp ch06 Bolum6_Metotlar

# Paketli (package ch02; gibi) örnekler:
java -cp . ch02.Welcome1
```

