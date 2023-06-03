package com.supportportalMehdi.demo.AAAA.PARSING.services;

import com.supportportalMehdi.demo.AAAA.PARSING.dto.ReleveBancaireDto;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface ReleveBancaireService {
    ReleveBancaireDto createReleveBancaire(ReleveBancaireDto releveBancaireDto) ;
    Optional<ReleveBancaireDto> getReleveBancaireById(ObjectId id);
    List<ReleveBancaireDto> getAllReleveBancaires() ;
    ReleveBancaireDto updateReleveBancaire(ReleveBancaireDto releveBancaireDto) ;
    void deleteReleveBancaire(ObjectId id) ;
    ReleveBancaireDto parseAndExtract(MultipartFile file) throws IOException, ParseException;




}
