package com.t6.clinicapp.utileria;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import org.springframework.web.multipart.MultipartFile;

public class Utileria {
	
	public String ajustarCadena(String cadena) {
		String datoListo = "";
		datoListo = eliminarEspaciosEnBlancoTabuladoresRetornosInicioFinalCadena(cadena);
		datoListo = eliminarEspaciosEnBlancoMasDeDosTabuladoresRetornosInicioFinalCadena(datoListo);

		return datoListo;
	}

	// Retira de una cadena todos los espcios en blanco
	public String eliminarEspaciosEnBlanco(String cadena) {
		String datoListo = "";
		datoListo = cadena.replaceAll(" ", "");

		return datoListo;
	}

	public String eliminarEspaciosEnBlancoTabuladoresRetornosInicioFinalCadena(String cadena) {
		String datoListo = "";
		datoListo = cadena.trim();
		return datoListo;
	}

	public String eliminarEspaciosEnBlancoMasDeDosTabuladoresRetornosInicioFinalCadena(String cadena) {
		String datoListo = "";
		datoListo = cadena.replaceAll("\\s{2,}", " ");

		return datoListo;
	}

	// Procesa un cadena y usa como separador el espacio en blanco para poblar array
	// de string
	public String[] separaCadenaEnBloquesPorEspacio(String cadena) {
		StringTokenizer tokens = new StringTokenizer(cadena, " ");
		int nDatos = tokens.countTokens();
		String[] ArreglodatosSalida = new String[nDatos];
		int i = 0;
		while (tokens.hasMoreTokens()) {
			String str = tokens.nextToken();
			ArreglodatosSalida[i] = str;
			i++;
		}
		return ArreglodatosSalida;
	}

	public static String guardarArchivo(MultipartFile multiPart, String ruta) {
		// Obtenemos el nombre original del archivo.
		String nombreOriginal = multiPart.getOriginalFilename();
		// Reemplazamos en el nombre de archivo los espacios por guiones.
		nombreOriginal = nombreOriginal.replace(" ", "-");
		// Agregamos al nombre del archivo 8 caracteres aleatorios para evitar
		// duplicados.
		String nombreFinal = randomAlphaNumeric(8) + nombreOriginal;
		try {
			// Formamos el nombre del archivo para guardarlo en el disco duro.
			File imageFile = new File(ruta + nombreFinal);
			System.out.println("Archivo: " + imageFile.getAbsolutePath());
			// Guardamos fisicamente el archivo en HD.
			multiPart.transferTo(imageFile);
			return nombreFinal;
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
	}

	/**
	 * Metodo para generar una cadena aleatoria de longitud N
	 * 
	 */
	public static String randomAlphaNumeric(int count) {
		String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * CARACTERES.length());
			builder.append(CARACTERES.charAt(character));
		}
		return builder.toString();
	}

}
