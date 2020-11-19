package com.anushma.covid.api.service.rest.calls;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import org.json.JSONObject;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anushma.covid.api.common.model.CovidDetailRequest;
import com.anushma.covid.api.common.model.CovidDetailResponse;

@Service
public class CovidRestApis {

	public CovidDetailResponse getCountrySpecificData(CovidDetailRequest request) {

		CovidDetailResponse response = new CovidDetailResponse();
		HttpURLConnection connection = null;
		URL url = null;
		try {
			
				String finalUrl = "https://api.covid19api.com/countries";

				url = new URL(finalUrl);
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Content-type", "application/json; charset=utf-8");
				connection.setDoOutput(true);
				
				
				
				DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
				InputStream is;
				try {
					is = connection.getInputStream();
				} catch (Exception e) {
					is = connection.getErrorStream();
				}

				StringBuilder urlResponse;
				try (BufferedReader rd = new BufferedReader(new InputStreamReader(is))) {

					urlResponse = new StringBuilder();
					String line = "";
					while ((line = rd.readLine()) != null) {
						urlResponse.append(line);
						urlResponse.append('\r');
					}

					JSONObject json = new JSONObject(urlResponse.toString());
					System.out.println(json);

				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (Exception e) {
				System.out.println("Hi");
			}

			return null;

		}

//	public CovidDetailResponse getCountrySpecificData(CovidDetailRequest request) {
//
//		RestTemplate restTemplate = new RestTemplate();
////		final String baseUrl = RESTApiConstants.getCovidInformationByCountry + request.getCountry()
////				+ "?yesterday=true&strict=false&query";
//		final String baseUrl = "https://covid-19.dataflowkit.com/v1/india";
//		System.out.println(baseUrl);
//		try {
//			URI uri = new URI(baseUrl);
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("Accept", "*/*");
//			headers.setContentType(MediaType.APPLICATION_JSON);
//
//			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//
//			ResponseEntity<String> resp = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
//
////			 restTemplate.getForEntity(uri, entity,String.class);
//
//			System.out.println(resp.getBody());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
}
