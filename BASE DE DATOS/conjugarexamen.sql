-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 29-07-2014 a las 17:00:25
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `conjugarexamen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examenconjugar`
--

CREATE TABLE IF NOT EXISTS `examenconjugar` (
  `id` int(5) NOT NULL,
  `tituloexamen` varchar(1000) NOT NULL,
  `titulopregunta` varchar(5000) NOT NULL,
  `respclave` varchar(100) NOT NULL,
  `altera` varchar(500) NOT NULL,
  `alterb` varchar(500) NOT NULL,
  `alterc` varchar(500) NOT NULL,
  `alterd` varchar(500) NOT NULL,
  `altere` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `examenconjugar`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nexamen`
--

CREATE TABLE IF NOT EXISTS `nexamen` (
  `idexamen` int(5) NOT NULL AUTO_INCREMENT,
  `tituloexamen` varchar(1000) COLLATE latin1_spanish_ci NOT NULL,
  `titulopregunta` varchar(5000) COLLATE latin1_spanish_ci NOT NULL,
  `respclave` int(4) NOT NULL,
  `altera` varchar(500) COLLATE latin1_spanish_ci NOT NULL,
  `alterb` varchar(500) COLLATE latin1_spanish_ci NOT NULL,
  `alterc` varchar(500) COLLATE latin1_spanish_ci NOT NULL,
  `alterd` varchar(500) COLLATE latin1_spanish_ci NOT NULL,
  `altere` varchar(500) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`idexamen`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=23 ;

--
-- Volcar la base de datos para la tabla `nexamen`
--

INSERT INTO `nexamen` (`idexamen`, `tituloexamen`, `titulopregunta`, `respclave`, `altera`, `alterb`, `alterc`, `alterd`, `altere`) VALUES
(17, 'cultura general', 'fue el padre del primer presidente civil del peru', 2, 'Mariano Pardo Nieto', 'Manuel Castilo Rivero', 'Marino I. Prado', 'Felipe Pardo y Aliaga', 'Mariano Prado Bustamante'),
(18, 'cultura general', 'La explotacion mercatilista de los rescursos naturaes en el peru durante \nla colonia se expreso fundamentalmente respecto al trabajo indigena, atraves de:	', 3, 'El yanaconaje', 'El pongaje', 'La mita minera', 'El Ayllu', 'Los cholos'),
(19, 'cultura general', 'Es el actual ministro de educacion', 2, 'Patricia salas', 'Mercedes Cabanillas', 'Milton Ricali', 'Jaime Saavedra', 'Ideal Vexler'),
(20, 'cultura general', 'Representa a chavez en el gobierno Venezolano', 1, 'Maduro', 'Capriles', 'Cabello', 'Castro', 'Correa'),
(21, 'cultura general', 'La region de Peru que tiena Mayor  problemas debido al exceso radiacion\nsolar es :', 2, 'Tacna ', 'Arequipa', 'Cajamarca', 'Lima', 'Piura'),
(22, 'cultura general', 'Senale el distrito donde se encuentra gran Teatro Nacional', 3, 'Lima-Cercado', 'La victoria', 'San Luis', 'San Borja', 'Jesus Maria');
