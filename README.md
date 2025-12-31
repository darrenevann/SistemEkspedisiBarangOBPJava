# Sistem Ekspedisi Barang (Java Spring Boot)

Sistem manajemen pengiriman barang berbasis web yang dirancang untuk mengelola data kurir, menghitung biaya pengiriman berdasarkan kategori (Reguler, Kilat, Kargo), dan mencatat riwayat transaksi. Proyek ini menggunakan arsitektur MVC (Model-View-Controller) dengan Spring Boot sebagai framework utama.

## Fitur Utama
- **Autentikasi Admin**: Sistem login khusus untuk pengelola sistem.
- **Manajemen Kurir**: Operasi CRUD (Create, Read, Update, Delete) data kurir dengan pembuatan ID kurir otomatis.
- **Manajemen Kiriman**: Input data kiriman dengan tiga kategori:
  - **Reguler**: Biaya berdasarkan berat barang.
  - **Kilat**: Biaya berdasarkan berat barang ditambah biaya dasar kilat.
  - **Kargo**: Biaya khusus untuk pengiriman besar (minimal 10kg) dengan input volume opsional.
- **Pencatatan Riwayat**: Setiap transaksi kiriman disimpan secara otomatis ke dalam file lokal `histori.txt`.
- **Dashboard Dinamis**: Tampilan ringkasan data kiriman dan kurir menggunakan Thymeleaf.

## Teknologi yang Digunakan
- **Backend**: Java 17, Spring Boot 3.5.7.
- **Database**: MySQL (Utama), H2 (Development/Testing).
- **ORM**: Spring Data JPA (Hibernate).
- **Frontend**: Thymeleaf, HTML5, CSS3, JavaScript.
- **Dependency Management**: Maven.

## Struktur Entitas & Arsitektur
- **Inheritance**: Menggunakan strategi `SINGLE_TABLE` untuk entitas `Kiriman` dengan subclass `KirimanReguler`, `KirimanKilat`, dan `KirimanKargo`.
- **Interface**: Implementasi `PerhitunganBiaya` untuk standarisasi logika hitung biaya di setiap tipe kiriman.
- **Repository**: Abstraksi akses database menggunakan JpaRepository.

## Cara Instalasi
1. Clone repositori ini.
2. Konfigurasi database MySQL pada file `src/main/resources/application.properties`. Pastikan database bernama `ekspedisi` sudah tersedia.
3. Jalankan perintah Maven: `./mvnw spring-boot:run` (Linux/macOS) atau `mvnw.cmd spring-boot:run` (Windows).
4. Akses aplikasi melalui browser di: `http://localhost:8081/admin/login`.

## Pengembang
- **Darren Evan Nathanael** (825240062)
- **Leticia Michelle Purba** (8252401440)
