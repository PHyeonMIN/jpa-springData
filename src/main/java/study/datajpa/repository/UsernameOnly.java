package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    @Value("#{target.username + ' ' + target.age}") // open projections : 엔티티를 다가져와서 처리
    String getUsername();                           // close projections : 정확하게 매칭이 되는 것
}
