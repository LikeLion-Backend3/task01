package org.example.hw01.data.dao;

import org.example.hw01.data.entity.BabyLion;

public interface BabyLionDAO {
    BabyLion insertLion(BabyLion babyLion);

    BabyLion selectLion(String email) throws Exception;

    BabyLion updateLionName(String email, String name) throws Exception;

    void deleteLion(String email) throws Exception;
}
