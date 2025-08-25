package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PersonRepository {
    private final int version;
    private long i;

    public long count() {
        System.out.println("PersonRepository(v%d).count() 작동".formatted(version));
        return i++;
    }
}
