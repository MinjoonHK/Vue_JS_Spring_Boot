package org.africalib.gallery.backend.repository;

import org.africalib.gallery.backend.entity.item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<item, Integer> {
}
