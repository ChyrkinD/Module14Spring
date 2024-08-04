package org.example.service;

import org.example.dao.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private List<Note> notes;

    public List<Note> listAll(){
        return notes;
    }

}
