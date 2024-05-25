-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Bulan Mei 2024 pada 10.20
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universitas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dosen`
--

CREATE TABLE `dosen` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dosen`
--

INSERT INTO `dosen` (`id`, `nama`, `no_hp`, `email`) VALUES
(1, 'Dr.Awang Hendrianto Pratomo,S.T, M.T', '+62 819-3176-7489', 'awang@upnyk.ac.id'),
(2, 'Andiko Putro Suryotomo, S.Kom, M.Cs', '+62 818-0274-8228', 'andiko.ps@upnyk.ac.id'),
(3, 'Dessyanto Boedi Prasetyo, S.T, M.T', '+62 878-3963-5954', 'dess@upnyk.ac.id'),
(4, 'Rochmat Husaini, S.Kom, M.Kom', '+62 856-4340-4141', 'husaini@upnyk.ac.id'),
(5, 'Frans Richard Kodong, S.T, M.Kom', '+62 878-3822-9010', 'frans.ricard@upnyk.ac.id'),
(6, 'Hari Prapcoyo, S.Kom, M.ICT', '+62 812-5000-215', 'hari.prapcoyo@upnyk.ac.id'),
(7, 'Mangaras Yanu F.,S.T, M.T', '+62 817-4109-001', 'mangaras.yanu@upnyk.ac.id'),
(8, 'Dyah Ayu Irawati, S.T, M.Cs', '+62 812-3224-7483', 'dyah.ayu.irawati@upnyk.ac.id'),
(9, 'Dr. Heriyanto, A.Md, S.Kom, M.Cs', '081328791352', 'heriyanto@upnyk.ac.id'),
(10, 'Shoffan Saifullah, S.Kom, M.Kom', '+62 858-7717-7459', 'shoffans@upnyk.ac.id');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `nim` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `angkatan` varchar(10) NOT NULL,
  `username` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nama`, `nim`, `email`, `password`, `angkatan`, `username`) VALUES
(1, 'Alvino Abyan Rizaldi', '123220114', 'abyan@gmail.com', '2022', '2022', ''),
(2, 'ROYAN ADITYA', '123220174', 'royan@gmail.com', '2022', '2022', 'royan'),
(3, 'JUAN AZHAR ADVISETA SETIAWAN', '123200139', 'juan@gmail.com', '2020', '2020', ''),
(4, 'GUSTANSYAH DWI PUTRA SUJANTO', '123220210', 'gustan@gmail.com', '2022', '2022', ''),
(6, 'RESTI RAMADHANI', '123220147', 'resti@gmail.com', '2022', '2022', ''),
(7, 'Muhammad Rafli', '123210078', 'rafli@gmail.com', '2021', '2021', ''),
(8, 'HANAFIE BUDI PRATAMA', '123220166', 'budi@gmail.com', '2022', '2022', ''),
(9, 'Jeslyn Vicky Hanjaya', '123220150', 'jess@gmail.com', '2022', '2022', ''),
(10, 'RIZKY APRILIA INEZTRI UTOMO', '123220012', 'april@gmail.com', '2022', '2022', '');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
