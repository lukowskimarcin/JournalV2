package com.journal.account.core.adapter.out.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Accounts")
@Data
public class AccountMongoEntity {
    
}
