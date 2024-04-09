package com.example.annotationprocessing.example;


import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SponsorMapper {
    Sponsor toEntity(SponsorDto sponsorDto);

    SponsorDto toDto(Sponsor sponsor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Sponsor partialUpdate(
            SponsorDto sponsorDto, @MappingTarget Sponsor sponsor);
}