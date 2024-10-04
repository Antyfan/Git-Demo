package com.git.demo.interfaces.web;

import com.git.demo.interfaces.web.adapter.LibraryAdapter;
import com.git.demo.interfaces.web.dto.LibraryInfoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LibraryController {

    //there will be implementation of lib controller

    //another comment for the conflict
    private final LibraryAdapter libraryAdapter;

    @RequestMapping
    public LibraryInfoDTO getLibraryInfo(@PathVariable("libraryId") String libId) {
        return libraryAdapter.getLibraryInfo(libId);
    }
}
