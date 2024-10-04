package com.git.demo.interfaces.web.adapter;

import com.git.demo.interfaces.web.dto.LibraryInfoDTO;

public interface LibraryAdapter {
    LibraryInfoDTO getLibraryInfo(String libraryId);
}
