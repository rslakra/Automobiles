package com.rslakra.automobile.domain.repositories;

import com.rslakra.automobile.domain.entities.Appointment;
import com.rslakra.automobile.domain.entities.AutoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rohtash Lakra
 * @since 09-16-2019 1:39:44 PM
 */
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    /**
     * Returns the appointments of the given user.
     *
     * @param user
     * @return
     */
    public List<Appointment> findByUser(AutoUser user);

}
