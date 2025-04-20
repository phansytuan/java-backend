package com.tuancode.service.impl;

import com.tuancode.service.FileService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class FileServiceImpl implements FileService {

  @Override
  public String getBase64FromPath(String path) {
    if (StringUtils.isEmpty(path)) {
      return null;
    }

    String base64 = null;
    // convert file to String base 64
    try {
      File file = new File(path);
      byte[] bytes = Files.readAllBytes(file.toPath());
      base64 = Base64.getEncoder().encodeToString(bytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return base64;
  }
}
