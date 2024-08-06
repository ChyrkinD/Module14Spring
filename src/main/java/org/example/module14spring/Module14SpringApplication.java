package org.example.module14spring;

import org.example.dao.model.Note;
import org.example.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Random;

@SpringBootApplication
public class Module14SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Module14SpringApplication.class, args);
        Note note1 = new Note().builder()
                .title("Note1 Title")
                .content("Note1 Content")
                .build();
        Note note2 = new Note().builder()
                .title("Note2 Title")
                .content("Note2 Content")
                .build();
        NoteService noteService = new NoteService(new ArrayList<Note>());

        Note firstNoteWithGeneratedId = noteService.add(note1);

        Note secondNoteWithGeneratedId = noteService.add(note2);

        noteService.listAll().stream().forEach(System.out::println);

        System.out.println("Get by id");
        Note getByIdNote = noteService.getById(firstNoteWithGeneratedId.getId());
        System.out.println(getByIdNote);

        System.out.println("List after update second note");
        secondNoteWithGeneratedId.setTitle("Changed title");
        secondNoteWithGeneratedId.setContent("Changed Content");
        noteService.update(secondNoteWithGeneratedId);
        System.out.println(noteService.listAll());

        System.out.println("List after delete second note");
        noteService.deleteById(secondNoteWithGeneratedId.getId());
        System.out.println(noteService.listAll());
    }

}
