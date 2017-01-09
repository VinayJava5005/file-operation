package com.fileoperation.controllers;

import com.fileoperation.services.FileUploader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("file")
public class FileOperationController {

    @Autowired
    FileUploader fileUploader;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void uploadFile(@RequestParam("file") MultipartFile uploadedFile) throws IOException, InvalidFormatException {

        if (!uploadedFile.isEmpty()) {
            System.out.println("Uploading file : " + uploadedFile.getName());
            fileUploader.parser(uploadedFile.getInputStream());
        }
    }

}