-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Okt 2025 pada 16.11
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pelayanan_kesehatan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(15) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `nama`, `jenis_kelamin`, `no_telepon`, `email`, `password`) VALUES
('ADM0001', 'iklima', 'PEREMPUAN', '087887840110', 'iklima@gmail.com', 'iklima29');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` varchar(25) NOT NULL,
  `nama_dokter` varchar(100) NOT NULL,
  `jenis_dokter` varchar(50) NOT NULL,
  `spesialis` varchar(50) NOT NULL,
  `jadwal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `jenis_dokter`, `spesialis`, `jadwal`) VALUES
('DOK0001', 'drg.Ibrahim Ahmad', 'GIGI', '-', 'senin-jumat'),
('DOK0002', 'dr. firmansyah', 'GIGI', '-', 'kamis-sabtu'),
('DOK0003', 'dr. aulia', 'Umum', 'Spesialis Penyakit Dalam', 'Senin-Jumat'),
('DOK0004', 'dr. iklima', 'SPESIALIS', 'SPESIALIS ANAK', 'senin-rabu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `isi_konsultasi`
--

CREATE TABLE `isi_konsultasi` (
  `id_isi_konsultasi` int(11) NOT NULL,
  `no_konsultasi` varchar(20) NOT NULL,
  `nik_pasien` varchar(50) NOT NULL,
  `gejala` varchar(200) NOT NULL,
  `tindakan` varchar(50) NOT NULL,
  `id_dokter` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `isi_konsultasi`
--

INSERT INTO `isi_konsultasi` (`id_isi_konsultasi`, `no_konsultasi`, `nik_pasien`, `gejala`, `tindakan`, `id_dokter`) VALUES
(1, 'TRX0002', '098765', 'Demam', 'Rawat Jalan', 'DOK0003'),
(2, 'TRX0003', '098765', 'demam', 'Rawat Jalan', 'DOK0004'),
(3, 'TRX0004', '234567', 'demam', 'Rawat Jalan', 'DOK0001'),
(4, 'TRX0005', '098765', 'Demam', 'Rawat Jalan', 'DOK0004'),
(5, 'TRX0009', '002345', 'Pusing', 'Rawat Jalan', 'DOK0003'),
(6, 'TRX0010', '002345', 'demam', 'Rawat Jalan', 'DOK0003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `isi_nota`
--

CREATE TABLE `isi_nota` (
  `id_isi_nota` int(11) NOT NULL,
  `id_nota` varchar(25) NOT NULL,
  `kode_obat` varchar(15) NOT NULL,
  `harga_obat` varchar(25) NOT NULL,
  `satuan_obat` varchar(20) NOT NULL,
  `qty` varchar(25) NOT NULL,
  `total_harga` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `isi_nota`
--

INSERT INTO `isi_nota` (`id_isi_nota`, `id_nota`, `kode_obat`, `harga_obat`, `satuan_obat`, `qty`, `total_harga`) VALUES
(1, 'IN0006', 'KD0001', '10000', 'STRIP', '4', '40000'),
(2, 'IN0007', 'KD0002', '5000', 'STRIP', '7', '35000'),
(3, 'IN0008', 'KD0001', '25000', 'BOX', '1', '25000'),
(4, 'IN0008', 'KD0002', '5000', 'STRIP', '2', '10000'),
(5, 'IN0010', 'KD0002', '5000', 'STRIP', '1', '5000'),
(6, 'IN0011', 'KD0001', '25000', 'BOX', '1', '25000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `konsultasi`
--

CREATE TABLE `konsultasi` (
  `no_konsultasi` varchar(20) NOT NULL,
  `tgl_konsultasi` varchar(30) NOT NULL,
  `id_dokter` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `konsultasi`
--

INSERT INTO `konsultasi` (`no_konsultasi`, `tgl_konsultasi`, `id_dokter`) VALUES
('TRX0001', '2023-07-08', 'DOK0001'),
('TRX0002', '2023-07-08', 'DOK0003'),
('TRX0003', '2023-07-09', 'DOK0004'),
('TRX0004', '2023-07-09', 'DOK0001'),
('TRX0005', '2025-10-05', 'DOK0004'),
('TRX0006', '2025-10-05', 'DOK0003'),
('TRX0007', '2025-10-05', 'DOK0003'),
('TRX0008', '2025-10-05', 'DOK0004'),
('TRX0009', '2025-10-05', 'DOK0003'),
('TRX0010', '2025-10-05', 'DOK0003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nota`
--

CREATE TABLE `nota` (
  `id_nota` varchar(25) NOT NULL,
  `tgl_nota` varchar(20) NOT NULL,
  `nik_pasien` varchar(25) NOT NULL,
  `id_admin` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `nota`
--

INSERT INTO `nota` (`id_nota`, `tgl_nota`, `nik_pasien`, `id_admin`) VALUES
('IN0001', '2023-07-07', '098765', 'ADM0001'),
('IN0002', '2023-07-07', '234567', 'ADM0001'),
('IN0003', '2023-07-08', '123456', 'ADM0001'),
('IN0004', '2023-07-08', '123456', 'ADM0001'),
('IN0005', '2023-07-08', '098765', 'ADM0001'),
('IN0006', '2023-07-08', '098765', 'ADM0001'),
('IN0007', '2023-07-08', '123456', 'ADM0001'),
('IN0008', '2025-10-05', '098765', 'ADM0001'),
('IN0009', '2025-10-05', '435601', 'ADM0001'),
('IN0010', '2025-10-05', '098765', 'ADM0001'),
('IN0011', '2025-10-05', '002345', 'ADM0001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `kode_obat` varchar(15) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `jenis_obat` varchar(20) NOT NULL,
  `harga` int(15) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `stok` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`kode_obat`, `nama_obat`, `jenis_obat`, `harga`, `satuan`, `stok`) VALUES
('KD0001', 'paracetamol', 'OBAT TABLET', 25000, 'BOX', '50'),
('KD0002', 'latibet', 'OBAT TABLET', 5000, 'STRIP', '100');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `nik_pasien` varchar(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tgl_lahir` varchar(15) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jaminan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`nik_pasien`, `nama`, `tgl_lahir`, `jenis_kelamin`, `no_telepon`, `alamat`, `jaminan`) VALUES
('002345', 'Iklima Azizah', '29 April 2002', 'perempuan', '087887840110', 'Depok', 'PRIBADI'),
('098765', 'Shani Indira', '05 Oktober 1998', 'Perempuan', '08785986573', 'Yogyakarta', 'PRIBADI'),
('234567', 'Shania Gracia', '31 Agustus 1999', 'Perempuan', '089694830872', 'tangerang', 'BPJS'),
('435601', 'Azizi Asadel', '04 Juni 2004', 'Perempuan', '085643601111', 'Tangerang', 'BPJS');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indeks untuk tabel `isi_konsultasi`
--
ALTER TABLE `isi_konsultasi`
  ADD PRIMARY KEY (`id_isi_konsultasi`),
  ADD KEY `fk_isi_konsultasi_dokter` (`id_dokter`),
  ADD KEY `fk_isi_konsultasi_pasien` (`nik_pasien`),
  ADD KEY `fk_isi_konsultasi_konsultasi` (`no_konsultasi`);

--
-- Indeks untuk tabel `isi_nota`
--
ALTER TABLE `isi_nota`
  ADD PRIMARY KEY (`id_isi_nota`),
  ADD KEY `fk_isi_nota_nota` (`id_nota`),
  ADD KEY `fk_isi_nota_obat` (`kode_obat`);

--
-- Indeks untuk tabel `konsultasi`
--
ALTER TABLE `konsultasi`
  ADD PRIMARY KEY (`no_konsultasi`);

--
-- Indeks untuk tabel `nota`
--
ALTER TABLE `nota`
  ADD PRIMARY KEY (`id_nota`),
  ADD KEY `fk_admin_nota` (`id_admin`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kode_obat`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`nik_pasien`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `isi_konsultasi`
--
ALTER TABLE `isi_konsultasi`
  MODIFY `id_isi_konsultasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `isi_nota`
--
ALTER TABLE `isi_nota`
  MODIFY `id_isi_nota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `isi_konsultasi`
--
ALTER TABLE `isi_konsultasi`
  ADD CONSTRAINT `fk_isi_konsultasi_dokter` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_isi_konsultasi_konsultasi` FOREIGN KEY (`no_konsultasi`) REFERENCES `konsultasi` (`no_konsultasi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_isi_konsultasi_pasien` FOREIGN KEY (`nik_pasien`) REFERENCES `pasien` (`nik_pasien`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `isi_nota`
--
ALTER TABLE `isi_nota`
  ADD CONSTRAINT `fk_isi_nota_nota` FOREIGN KEY (`id_nota`) REFERENCES `nota` (`id_nota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_isi_nota_obat` FOREIGN KEY (`kode_obat`) REFERENCES `obat` (`kode_obat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `fk_admin_nota` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
