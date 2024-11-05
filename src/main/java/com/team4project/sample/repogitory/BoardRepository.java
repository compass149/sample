package com.team4project.sample.repogitory;

import com.team4project.sample.domain.Board;
import com.team4project.sample.repogitory.search.BoardSearch;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
    @EntityGraph(attributePaths = {"imageSet"})
    @Query("select b from Board b where b.bno =:bno")
    Optional<Board> findByIdWithImages(Long bno);

//    @Query("select b from Board b where b.title like concat('%',:keyword,'%') order by b.bno desc")
//    Page<Board> searchAll(String keyword, Pageable pageable);

}
