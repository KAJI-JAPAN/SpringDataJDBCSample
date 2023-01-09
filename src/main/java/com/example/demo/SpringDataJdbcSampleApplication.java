package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
		.getBean(SpringDataJdbcSampleApplication.class).execute();
	}
	@Autowired
	MemberCrudRepository repository;
	// 登録と全件取得
	private void execute() {
	  //　登録
	  executeInsert();
	  // 全建取得
	  executeSelect();
	}
	//　登録
	private void executeInsert () {
	  //　エンティティ作成　idは自動連番のためnullを設定
	  Member member = new Member(null, "花子");
	  member = repository.save(member);
	  System.out.println("登録したデータ：" + member);
	}
	//	全件取得
	private void executeSelect () {
	  System.out.println("--ここから全件取得--");
	  //リポジトリを使用して全件取得
	  Iterable<Member>members = repository.findAll();
	  for (Member member:members) {
	    System.out.println(member);
	  }
	}
}
