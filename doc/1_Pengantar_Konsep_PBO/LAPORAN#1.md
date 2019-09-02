# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

1. Perbedaan paradigma berorientasi objek dengan paradigma                struktural 
2. Konsep dasar PBO 

## Ringkasan Materi

Konsep utama dalam pemrograman berorientasi objek. Segala sesuatu adalah OBJEK. Objek adalah reseprentasi sebuah item, unit atau entitas individu, dapat diidentifikasi.
 Contoh : real atau abstrak
• Tangible : mobil, printer
• Peranan : pekerja, boss

OBJEK = Atribut + Operasi
Objek merupakan data dalam sistem. Dimanipulasi oleh operasi. Dalam implementasi, atribut berupa objek lain, atau rujukan ke objek lain. Sering disebut methods. Dapat memanipulasi atribut dalam sebuah kelas. Dapat memanggil operasi dalam kelas yang lain. Mengirim dan menerima informasi atau pesan sebagai parameter.
Contoh :
Objek memiliki nama , misal : anjing
Objek memiliki atribut yang mengidentifikasikan keadaan (states) , misal : warna, berat, jenis kelamin
Objek memiliki operasi yang menyatakan apa yang dilakukan oleh objek , misal : menggonggong, berlari, berbaring

Class adalah sekumpulan objek.
Semua objek dalam suatu kelas memiliki atribut dan operasi yang sama, tetapi nilai atribut dapat berbeda. Suatu objek tertentu merupakan INSTANCE suatu kelas. Dunia terbuat atau tersusun atas objek. Ita tahu tentang objek (attributes). Kita dapat melakukan suatu pada objek (operations).
• Kadang melakukan suatu pada objek mengubah atributnya. Objek terbuat dari objek yang lebih kecil
• Kita dapat mengerti objek besar dengan mengerti bagian-bagian pembentuknya.
Objek bekerjasama dengan objek lain untuk mencapai suatu maksud / tujuan.

Abstraksi adalah cara kita melihat suatu sistem dalam bentuk yang lebih sederhana, yaitu sebagai suatu kumpulan subsistem (object) yang saling berinteraksi.

Modularity adalah sifat objek = modular. Objek dapat ditulis dan dimantain terpisah (independen) dari objek lain. Contoh : Mobil adalah sekumpulan sistem pengapian, sistem kemudi, sistem pengereman.
Enkap – sulasi adalah suatu teknik dimana data dibuat dalam suatu paket beserta dengan fungsi yang bersesuaian
Antarmuka ke objek didefinisikan sedemikain rupa sehingga memperlihatkan sekecil mungkin sebagaimana objek bekerja. Mekanisme menyembunyikan suatu proses dalam sistem untuk menghindari interfensi dan menyederhanakan pengguna sistem itu sendiri. Contoh : tombol on / of / pengaturan suhu atau AC.

Inhertance / pewarisan adalah mekanisme *) mewarisi / menurunkan karateristik ke objek lain.
 Contoh :
Bicycle :
Mountain bike
Racing bike
Tandem bike

Polimorfisme 
• Memiliki banyak bentuk (rupa)
Kemampuan objek-objek yang berbeda untuk memberi respons terhadap permintaan yang sama.
• Sesuai dengan cara masing-masing objek
 Contoh :
Segitiga luas
Lingkaran luas
Bujursangkar luas




## Percobaan

### Percobaan 1

Kita dapat mengetahui pengurangan dan pertambahan kecepatan jika terjadi pergantian gear dan pengeriman rem.

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![schot.1](img/schot1.PNG)

Contoh link kode program : [ini contoh link ke kode program](D:\CLASS 2 SMT 3\PBO\Jobsheet 1\Jobsheet1PBO\src\SepedaDemo1841720143.java)

### Percobaan 2

Dalam percobaan ini, terdapat turunan/warisan dari class Sepeda.Pada dasarnnya sama,tetapi bedanya terdapat tipe suspensi.Jadi kita tidak perlu membuat class SepedaGunung dari awal,karena sudah terodapat warisan/turunana dari class sepeda 

![schot1](img/schot1.PNG)

Contoh link kode program : [ini contoh link ke kode program](D:\CLASS 2 SMT 3\PBO\Jobsheet 1\Jobsheet1PBO\src\SepedaGunung1841720143Irgy.java)

## Pertanyaan

1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman    berorientasi objek! 
2. Apa yang dimaksud dengan object dan apa bedanya dengan         class? 
3. Sebutkan salah satu kelebihan utama dari pemrograman           berorientasi objek dibandingkan dengan pemrograman             struktural! 
4. Pada class Sepeda, terdapat state/atribut apa saja? 
5. Tambahkan atribut warna pada class Sepeda. 
6. Mengapa pada saat kita membuat class SepedaGunung, kita        tidak perlu membuat class nya dari nol? 

## Jawaban

1. 
    a. Object adalah Membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer, objek merupakan dasar dari modularitas dan struktur dalam sebuah program komputer berorientasi objek. 

    b. Class adalah Merupakan kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu.Sebagai contoh ‘class of cats‘ adalah suatu unit yang terdiri atas definisi-definisi data dan fungsi-fungsi yang menunjuk pada berbagai macam perilaku/ turunan dari kucing.

    c. Enkapsulasi adalah Memastikan pengguna sebuah objek tidak dapat mengganti keadaan dalam dari sebuah objek dengan cara yang tidak layak,hanya metode dalam objek tersebut yang diberi izin untuk mengakses keadaannya.Setiap objek mengakses interface yang menyebutkan bagaimana objek lainnya dapat berinteraksi dengannya

    d.Inheritance Adalah kemampuan sebuah class untuk menurunkan property atau method yang dimilikinya kedalam class lain. Tujuannya untuk menghindari duplikasi kode program dan reusable code.Contoh di dunia nyata, objek sepatu dapat diturunkan lagi ke model yang lebih luas, misal sepatu futsal dan sepatu Basket. Dimana masing-masing dapat memiliki komponen tambahan, misal sepeda sepatu basket memiliki bantalan yang lebih empuk, yang tidak dimiliki sepatu futsal. Dalam hal ini, objek sepatu basket dan sepatu futsal mewarisi objek sepatu. 

    e.Polimorfisme Adalah kemampuan sebuah object untuk mempunyai banyak bentuk atau mengungkapkan banyak hal melalui satu cara yang sama. Ada dua tipe, yaitu Overloading adalah suatu keadaan dimana beberapa method memiliki nama yang sama namun parameter method-nya berbeda. dan Overriding adalah suatu keadaan dimana method mempunyai nama yang sama dan fungsionalitas yang sama. Namun cara kerja fungsionalitas berbeda.

2. 
- Class merupakan kumpulan dari suatu fungsi-fungsi yang dibuat untuk suatu tujuan tertentu. Misalnya kita akan membuat sebuah Mobil. Maka yang perlu kita buatkan adalah beberapa class yang didalamnya berisi fungsi-fungsi yang dapat membuat Mobil itu dapat berjalan sebagaimana mestinya, misalnya class Roda, class Mesin, class Kerangka Mobil, class Body Mobil dan lain lain.

- Sedangkan Object adalah pemanfaatan dari class yang siap untuk digunakan, misalnya kita sudah membuat class Roda, yang di dalamnya itu berisi konsep bagaimana Roda itu bisa berjalan,bagaimana Roda itu bisa berputar dan lain-lain, jika semua konsep Roda sudah oke, barulah kita akan dirubah menjadi sebuah Roda yang siap untuk dipakai

3. 
- Dalam menggunakan sebuah class cukup sekali tidak perlu               dituis berkali-kali.

- Dapat menambahkan fitur pada class tanpa mengedit class asal.

- Menggunakan objek tanpa harus tahu teknis yang ada                    didalamnya.

- Data yang digunakan dalam bentuk private hanya bisa di akses   oleh fungsi lokasi, sehingga tidak perlu khawatir untuk        berpengaruh pada fungsi lainnya.

4. Ada atribut : Merk , Kecepatan dan Gear

5. (D:\CLASS 2 SMT 3\PBO\Jobsheet                   1\Jobsheet1PBO\src\Sepeda1841720143Irgy.java)

6. Karena class SepedaGunung memiliki suatu komponen tambahan (tipe suspensi). maka kita tidak perlu membuat  class baru, karena hanya mewariskan dari class sepeda saja

 
 

## Tugas

![schot2](img/schot2.PNG)

Contoh link kode program : [ini contoh link ke kode program](D:\CLASS 2 SMT 3\PBO\Jobsheet 1\Jobsheet1PBO\src\T1HewanDemo1841720143Irgy.java)

## Kesimpulan
 Pemrograman Berorientasi Objek (Object Oriented Programming atau OOP) merupakan pemrograman yang berorientasikan kepada objek.PBO merupakan pemrograman yang cukup dominan sekarang,karena mampu memberikan solusi dalam pemrograman modern.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.PBO menekankan beberapa konsep, yaitu kelas, abstraksi,enkapsulasi,polimorfisme, dan inheritas.

Ttd,

Muhammad Irgy Pratama