package com.headless.cms.service;

import com.headless.cms.model.CustomSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class SequenceGeneratorService {

    @Autowired
    private MongoOperations mongoOperations;

    public Long generateSequence(String seqName) {
        Query query = new Query(Criteria.where("_id").is(seqName));
        Update update = new Update().inc("seq", 1);
        CustomSequence counter = mongoOperations.findAndModify(
                query,
                update,
                FindAndModifyOptions.options().returnNew(true).upsert(true),
                CustomSequence.class);
        return counter.getSeq();
    }
}

