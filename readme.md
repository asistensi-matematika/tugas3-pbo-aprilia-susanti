# TUGAS 3 ASISTENSI PBO - Jumat, 4 Oktober 2019

NAMA: APRILIA SUSANTI

NRP: 06111840000055

## Deskripsi Soal
Buat class **LinearEquation** untuk sistem persamaan linear 2x2:
* ax+by=e
* cx+dy=f
* x = (ed-bf)/(ad-bc)
* y = (af-ec)/(ad-bc)

Ketentuan class-nya:
* Menggunakan modifier **private** untuk a, b, c, d, e, f.
* Konstruktor kosong dan konstruktor dengan argumen a, b, c, d, e, f.
* method **setter** dan **getter** untuk a, b, c, d, e, f.
* Sebuah method **cekSolusi** untuk mengecek apakah persamaan yang diinputkan memiliki solusi atau tidak. Tidak memiliki solusi jika ad-bc=0

Buat juga **Diagram UML** dan **main class** untuk mengimplementasikan semua method di class **LinearEquation** yang kalian buat.

## Contoh
Contoh 1:
![](/img/1.png)

Penjelasan:
* a=4,b=-5,c=7,d=7,e=10,f=12
* x=  (10*7-(-5)*12)/(4*7-(-5)*7)=130/63=2,06
* y=  (4*12-10*7)/(4*7-(-5)*7)= -22/63≈-0,35

Contoh 2:
![](/img/2.png)
Penjelasan:
ad-bc=2*3-3*2=0
Karena penyebut nya 0, maka tidak memiliki solusi.

## Soal
Input 	: 12 5 13 0 12 7

Output	: ...


Input 	: -18 9 10,5 11 0 0

Output	: ...


### 1 extra mile
soal opsional, tapi selesaikan semua soal di atas terlebih dahulu

![](/img/3.png)

## Screenshot hasil

SOAL 1
![tugas 3 1](https://user-images.githubusercontent.com/55954995/66297049-165a9480-e919-11e9-956e-712169f6f5dd.JPG)

SOAL 2
![tugas 3 2](https://user-images.githubusercontent.com/55954995/66297050-165a9480-e919-11e9-8e92-a809b5f6b840.JPG)

EXTRA MILE
![tugas 3 3](https://user-images.githubusercontent.com/55954995/66297052-165a9480-e919-11e9-8f42-c3911543a365.JPG)

## Upload
upload seluruh folder project java-nya ke repository ini
