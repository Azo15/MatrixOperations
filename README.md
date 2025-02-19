# MatrixOperations README

## Proje Açıklaması
Bu proje, Java programlama dili kullanılarak çeşitli matris işlemlerini gerçekleştiren bir uygulamadır. Kullanıcıdan matris girdileri alarak matris çarpımı, determinant hesaplama, matris tersini bulma ve doğrusal bağımsızlık kontrolü işlemlerini yapar.

## Özellikler
1. **Matris Çarpımı**: Kullanıcıdan alınan iki 3x3 matrisin çarpımını hesaplar.
2. **Determinant Hesaplama**: 3x3 boyutundaki bir matrisin determinantını bulur.
3. **Matris Tersi (2x2 Matrisler için)**: 2x2 matrisin tersini hesaplar (determinantı 0 olmayan durumlar için).
4. **Doğrusal Bağımsızlık Kontrolü**: 3 adet 3 boyutlu vektörün doğrusal bağımsız olup olmadığını belirler.

## Kullanım
1. Program çalıştırıldığında kullanıcıdan 3x3 boyutunda iki matris girmesi istenir.
2. Girilen matrislerin çarpımı hesaplanıp ekrana yazdırılır.
3. Daha sonra kullanıcıdan 3x3 boyutunda bir matris girmesi istenir ve determinantı hesaplanır.
4. Kullanıcıdan 2x2 boyutunda bir matris girmesi istenir ve ters matris hesaplanıp ekrana yazdırılır.
5. Son olarak, kullanıcıdan 3 adet 3 boyutlu vektör girmesi istenir ve doğrusal bağımsızlık kontrolü yapılır.

## Çalıştırma Talimatları
1. Java yüklü olduğundan emin olun.
2. **MatrixOperations.java** dosyasını bir Java IDE veya terminal kullanarak derleyin ve çalıştırın:
   ```sh
   javac MatrixOperations.java
   java MatrixOperations
   ```
3. Programın yönlendirmelerine uyarak gerekli matrisleri girin.

## Örnek Giriş ve Çıktı
### Matris Çarpımı
#### Girdi:
```
Birinci matris:
1 2 3
4 5 6
7 8 9
İkinci matris:
9 8 7
6 5 4
3 2 1
```
#### Çıktı:
```
Matris Çarpımı Sonucu:
30 24 18
84 69 54
138 114 90
```

### Determinant Hesaplama
#### Girdi:
```
3x3 Matris:
1 2 3
4 5 6
7 8 9
```
#### Çıktı:
```
Determinant: 0
```

### 2x2 Matris Tersi
#### Girdi:
```
2x2 Matris:
4 7
2 6
```
#### Çıktı:
```
Matrisin Tersi:
0.60 -0.70
-0.20 0.40
```

### Doğrusal Bağımsızlık Kontrolü
#### Girdi:
```
Vektörler:
1 2 3
4 5 6
7 8 9
```
#### Çıktı:
```
Vektörler doğrusal olarak bağımlıdır.
```

## Gereksinimler
- Java 8 veya üstü
- Komut satırı veya bir Java IDE (Örneğin: IntelliJ IDEA, Eclipse, NetBeans)

## Lisans
Bu proje açık kaynak olup dilediğiniz gibi kullanılabilir ve geliştirilebilir.

