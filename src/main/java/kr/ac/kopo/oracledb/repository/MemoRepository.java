package kr.ac.kopo.oracledb.repository;

import kr.ac.kopo.oracledb.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
