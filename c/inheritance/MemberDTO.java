package c.inheritance;

public class MemberDTO{
    public String name;
    public String phone;
    public String email;

    public MemberDTO(){
    }
    public MemberDTO(String name){
            this.name = name;
    }
    public MemberDTO(String name, String phone){
            this.name = name;
            this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
    }
    @Override
    public String toString(){
        return "Name : " + name + ", Phone : " + phone + ", email : " + email;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MemberDTO other = (MemberDTO) obj;

        // 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행

        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;

        // name과 같은 비교 수행
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;

        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;

        // 모든 난관을 거쳐서 false를 리턴하지 않는 객체는 같은 객체로 생각해서 true를 리턴한다.
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}