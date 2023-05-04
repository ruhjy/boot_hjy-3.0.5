package com.example.demo.controller;

import java.io.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import jakarta.annotation.*;
import software.amazon.awssdk.auth.credentials.*;
import software.amazon.awssdk.awscore.exception.*;
import software.amazon.awssdk.core.exception.*;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.*;
import software.amazon.awssdk.services.s3.*;
import software.amazon.awssdk.services.s3.model.*;

@Controller
@RequestMapping("/sub32")
public class Controller32 {

	@Value("${aws.accessKeyId}")
	private String accessKey;

	@Value("${aws.secretAccessKey}")
	private String secretKey;

	@Value("${aws.bucketName}")
	private String bucketName;

	S3Client s3;

	@PostConstruct
	public void init() {
		Region region = Region.AP_NORTHEAST_2;

		AwsCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
		AwsCredentialsProvider provider = StaticCredentialsProvider.create(credentials);

		this.s3 = S3Client.builder()
				.credentialsProvider(provider)
				.region(region)
				.build();
	}

	@GetMapping("/link1")
	public void method1() {

		String key = "test/myFile2.txt";
		String content = "새로운 파일 내용물";

		// s3에 파일 업로드
		PutObjectRequest objectRequest = PutObjectRequest.builder()
				.bucket(bucketName)
				.acl(ObjectCannedACL.PUBLIC_READ)
				.key(key)
				.build();

		s3.putObject(objectRequest, RequestBody.fromBytes(content.getBytes()));
	}

	@GetMapping("/link2")
	public void method2() {
		String key = "test/myFile.txt";

		DeleteObjectRequest deleteObjectRequest = DeleteObjectRequest.builder()
				.bucket(bucketName)
				.key(key)
				.build();

		// s3에 업로드한 파일 삭제
		s3.deleteObject(deleteObjectRequest);
	}

	@GetMapping("/link3")
	public void method3() {
		// 파일 업로드 가능한 폼있는 뷰로 포워드
	}

	@PostMapping("/link4")
	public void method4(@RequestParam("files") MultipartFile[] files) {
		// aws s3 업로드
		for (MultipartFile file : files) {
			if (file.getSize() > 0) {
				
				String key = "test/" + file.getOriginalFilename();
				PutObjectRequest por = PutObjectRequest.builder()
						.key(key)
						.acl(ObjectCannedACL.PUBLIC_READ)
						.bucket(bucketName)
						.build();

				try {
					s3.putObject(por, RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
				} catch (S3Exception e) {
					e.printStackTrace();
				} catch (AwsServiceException e) {
					e.printStackTrace();
				} catch (SdkClientException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@PostMapping("/link5")
	public void method5(@RequestParam("fileName") String fileName) {

		String key = "test/" + fileName;

		System.out.println("key : " + key);
		DeleteObjectRequest dor = DeleteObjectRequest.builder()
				.key(key)
				.bucket(bucketName)
				.build();
		System.out.println("dor : " + dor);
		s3.deleteObject(dor);
	}

}
