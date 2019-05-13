package hello;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaytmRequestBody {
	
	private String userName;
	private String mobileNo;
	private String accountType;
	private String accountNo;

}
