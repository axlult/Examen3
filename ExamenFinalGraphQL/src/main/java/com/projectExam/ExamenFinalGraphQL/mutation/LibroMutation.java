package com.projectExam.ExamenFinalGraphQL.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.projectExam.ExamenFinalGraphQL.entities.Libro;
import com.projectExam.ExamenFinalGraphQL.services.LibroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class LibroMutation implements GraphQLMutationResolver {
    @Autowired
    private LibroServices libroServices;

    public Libro createLibro(String titule, String authorBook,String launchDate) {

        return this.libroServices.createLibro(titule, authorBook, launchDate);
    }

    public Libro updateLibro(int id,String titule, String authorBook,String launchDate) {
        Optional<Libro> book = this.libroServices.getLibro(id);
        if (book.isPresent()) {
            Libro libroEntity = book.get();
            if (titule!=null)
                libroEntity.setTitule(titule);
            if (authorBook != null)
                libroEntity.setAuthorBook(authorBook);
            if (launchDate != null)
                libroEntity.setLaunchDate(LocalDate.parse(launchDate));
            libroServices.save(libroEntity);
            return libroEntity;
        }
        return null;
    }

    public Libro deleteLibro(int id) {
        Optional<Libro> book = this.libroServices.getLibro(id);
        if (book.isPresent()) {
            Libro libroEntity = book.get();
            libroServices.deleteLibro(libroEntity);
            return libroEntity;
        }
        return null;

    }
}
