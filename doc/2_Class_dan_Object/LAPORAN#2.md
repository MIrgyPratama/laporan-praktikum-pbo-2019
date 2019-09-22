# Laporan Praktikum #2 - Class dan Object

## Kompetensi

- 1 Mahasiswa dapat memahami deskripsi dari class dan object
- 2 Mahasiswa memahami implementasi dari class 
- 3 Mahasiswa dapat memahami implementasi dari attribute 
- 4 Mahasiswa dapat memahami implementasi dari method 
- 5 Mahasiswa dapat memahami implementasi dari proses instansiasi 
- 6 Mahasiswa dapat memahami implementasi dari try-catch 
- 7 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML 

## Ringkasan Materi

- Class adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman).
- Method adalah suatu blok dari program yang berisi kode program nama dan properti yang dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak. Kata kunci untuk mengembalikan/mengeluarkan suatu nilai adalah return 
- Proses pembuatan Object dari suatu Class disebut instansiasi.
- Untuk menangani error di Java, digunakan sebuah statement yang bernama try - catch. Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung
- Unified Modeling Language ( UML ) adalah tujuan umum, perkembangan, bahasa pemodelan di bidang rekayasa perangkat lunak , yang dimaksudkan untuk menyediakan cara standar untuk memvisualisasikan desain sistem.
- Class diagram adalah sebuah class yang menggambarkan struktur dan penjelasan class, paket, `dan objek serta hubungan satu sama lain seperti pewarisan, asosiasi, dan lainlain.




## Percobaan

### Percobaan 1

Pada percobaan pertama adalah membuat class diagram dari suatu studi kasus dan juga beberapa pertanyaan sebagai berikut :

Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1. Gambarkan desain class diagram dari studi kasus 1!
2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1

Jawab :
1. Gambar desain class diagram Karyawan

    ![contoh screenshot](img/Schot0.png)

2. Karyawan

3. Atribut yang ada pada class diagram Karyawan antara lain :
   
   a. Atribut id dengan tipe data integer

   b. Atribut nama dengan tipe data String

   c. Atribut jenisKelamin dengan tipe data String

   d. Atribut jabatan dengan tipe data String

   e. Atribut gaji dengan tipe data double

4. terdapat dua method yang sudah saya buat yaitu :
   
   a. tampilBiodata

   b. tampilGaji




### Percobaan 2

Membuat dan mengakses anggota suatu classs

![contoh screenshot](img/Schot1.png)

Contoh link kode program : [TestMahasiswa1841720143Irgy](../../src/2_Class_dan_Object/TestMahasiswa1841720143Irgy.java)

Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
- Seluruh Atribut dideklarasikan dengan public pada class Mahasiswa

Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
- Seluruh method dideklarasikan pada class Mahasiswa

Berapa banyak objek yang di instansiasi pada program diatas!
- 1 

 Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
- Memasukkan atribut nim pada mhs1 dengan nilai 101

 Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?
- Memanggil method tampilBiodata pada mhs1

Instansiasi 2 objek lagi pada program diatas!
- Syntax :

        Mahasiswa1841720206Kaisar mhs2 = new Mahasiswa1841720206Irgy();
        mhs2.nim = 1841720143;
        mhs2.nama = "Irgy";
        mhs2.alamat = "Jl. Vinolia No 1A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodataIrgy();
        
        Mahasiswa1841720206Kaisar mhs3 = new Mahasiswa1841720206Irgy();
        mhs3.nim = 1841720143;
        mhs3.nama = "Irgy";
        mhs3.alamat = "Jl. Vinolia No 1A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodataIrgy();

### Percobaan 3

Menulis method yang memiliki argument/parameter dan memiliki return

![contoh screenshot](img/Schot2.png)

Link kode program :

[Barang1841720143Irgy.java](../../src/2_Class_dan_Object/Barang1841720143Irgy.java)

[TestBarang1841720143Irgy.java](../../src/2_Class_dan_Object/TestBarang1841720143Irgy.java)

 Apakah fungsi argumen dalam suatu method
 - Untuk menambahkan data dari luar method
 
 Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!
 - return berfungsi untuk mengembalikkan nilai akhir dari suatu method return dapat digunakan hanya pada method yang memiliki nilai misalnya meethod bertipe integer
 
 

## Tugas

## Tugas1

- Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas! 
 
    Penjelasan:
  
    a. Harga yang harus dibayar diperoleh dari lama sewa x harga.
   
    b. Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.
    
![contoh screenshot](img/SchotT1.png)


### Tugas2

- Buatlah program dari class diagram yang sudah anda buat di no 1!

![contoh screenshot](img/Schot3.png)

Link kode program :

[T1Game1841720143Irgy.java](../../src/2_Class_dan_Object/T1Game1841720143Irgy.java)

[T1TestGame1841720143Irgy.java](../../src/2_Class_dan_Object/T1TestGame1841720143Irgy.java)

### Tugas3

- Program dari Class diagram Lingkaran

![contoh screenshot](img/Schot4.png)

Link kode program :

[T3Lingkaran1841720143Irgy.java](../../src/2_Class_dan_Object/T3Lingkaran1841720143Irgy.java)

[T3TestLingkaran181720143Irgy.java](../../src/2_Class_dan_Object/T3TestLingkaran181720143Irgy.java)

### Tugas4

- Program Class diagram Barang

![contoh screenshot](img/Schot5.png)

Link kode program :

[T4Barang_tgas1841720143Irgy.java](../../src/2_Class_dan_Object/T4Barang_tgas1841720143Irgy.java)

[T4BarangTgasMain1841720143Irgy.java](../../src/2_Class_dan_Object/T4BarangTgasMain1841720143Irgy.java)

## Kesimpulan

Objek-objek ada secara independen, mempunyai aturan-aturan berkomunikasi dengan objek lain dan untuk memerintahkan objek lain guna meminta informasi tertentu atau meminta objek lain mengerjakan sesuatu. 
Kelas bertindak sebagai modul sekaligus tipe. Cara mengetahui apa yang dideklasikasin, biasanya ditandai dengan sintak tertentu.
Contohnya : class untuk Kelas, tipe data untuk atribut, void untuk metode, dan new untuk object


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

Muhammad Irgy Pratama
