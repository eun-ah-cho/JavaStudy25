package marioKart.dto;

public class MemberDTO {
	//필드
		public String id;
		public String pw;
		public String nickName; //별명(게임용)
		public String email; //암호찾기용
		public CharacterDTO characterDTO; //계정별 캐릭터 객체 
		
		
	//기본생성자
		public MemberDTO(){
			
		}
		//사용자가 만든 생성자
		public MemberDTO(String id, String pw, String nickName, String email, CharacterDTO characterDTO ){
			
			this.id = id;
			this.pw = pw;
			this.nickName = nickName;
			this.email = email;
		    this.characterDTO = characterDTO;
		}
}