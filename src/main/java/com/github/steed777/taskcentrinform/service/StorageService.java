package com.github.steed777.taskcentrinform.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void store(MultipartFile file);

    Stream<Path> loadAll() throws IOException;

    Path load(String filename);

    Resource loadAsResource(String filename) throws MalformedURLException;
}
