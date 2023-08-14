package com.springvalidation.service.impl;

import com.springvalidation.entity.Registration;
import com.springvalidation.payload.RegistrationDto;
import com.springvalidation.repositories.RegistrationRepository;
import com.springvalidation.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegistrationServiceImpl implements RegistrationService {


    private final ModelMapper modelMapper;
    private final RegistrationRepository registrationRepository;

    @Override
    public RegistrationDto saveRegistration(RegistrationDto registrationDto) {
        Registration registration = mapToEntity(registrationDto);
        Registration save = registrationRepository.save(registration);
        return mapToDto(save);
    }

    public Registration mapToEntity(RegistrationDto registrationDto){
        return modelMapper.map(registrationDto,Registration.class);
    }

    public RegistrationDto mapToDto(Registration registration){
        return modelMapper.map(registration,RegistrationDto.class);
    }
}
