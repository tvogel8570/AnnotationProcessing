package com.example.annotationprocessing.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SponsorRepositoryTest {
    QSponsor qs = QSponsor.sponsor;

    @Test
    void contextLoads() {
        assertThat(qs).isNotNull();
    }
}