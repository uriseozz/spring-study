package com.sparta.springcore.dto;

import com.sparta.springcore.model.Folder;
import lombok.Getter;

import java.util.List;

@Getter
public class FolderRequestDto {

    List<String> folderNames;
}
