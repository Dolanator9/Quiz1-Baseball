package Quiz1;

public class Baseball_Stats{
	/*A class for taking user input
	 * Input is baseball data
	 * Output is statistics based on the data
	 */
		private String Player;	//Player Name
		private int AB;	//At Bats
		private int H;	//Hits
		private int B2;	//Doubles
		private int B3;	//Triples
		private int HR;	//Home Runs
		private int R;	//Runs
		private int BB;	//Walks
		
		public void BaseballData(String playerName, int ab, int h, int b1, int b2, int b3, int hr, int r, int bb) {
			Player = playerName;
			AB = ab;
			H = h;
			B2 = b2;
			B3 = b3;
			HR = hr;
			R = r;
			BB = bb;
		}
		public String Get_Player_Name() {
			return Player;
		}
		public void Set_Player_Name(String playerName) {
			this.Player = playerName;
		}
		public int Get_At_Bats() {
			return AB;
		}
		public void Set_At_Bats(int ab) {
			AB = ab;
		}
		public int Get_Hits() {
			return H;
		}
		public void Set_Hits(int h) {
			H = h;
		}
		public int Get_Doubles() {
			return B2;
		}
		public void Set_Doubles(int b2) {
			B2 = b2;
		}
		public int Get_Triples() {
			return B3;
		}
		public void Set_Triples(int b3) {
			B3 = b3;
		}
		public int Get_Homeruns() {
			return HR;
		}
		public void Set_Homeruns(int hr) {
			HR = hr;
		}
		public int Get_Runs() {
			return R;
		}
		public void Set_Runs(int r) {
			R = r;
		}
		public int Get_Walks() {
			return BB;
		}
		public void Set_Walks(int bb) {
			BB =bb;
		}
		int B1 = H - B2 - B3 - HR;
		int BA = H/BB;
		int OBP = (H+BB)/(AB+BB);
		int SLG = (B1+(B2*2)+(B3*3)+(HR*4))/AB;
		int OBS = (OBP + SLG);
		int TB = (B1+(B2*2)+(B3*3)+(HR*4));
	}