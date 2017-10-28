package react;

public class Info
{
	public static final String COMMAND_HELP = "help";
	public static final String COMMAND_HELP_ALIAS_1 = "h";
	public static final String COMMAND_HELP_ALIAS_2 = "?";
	public static final String COMMAND_HELP_USAGE = "/react help";
	public static final String COMMAND_HELP_DESCRIPTION = "Shows a list of commands to use";

	public static final String NAME_TICK = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = 709522561;
			buf[0] = (byte) (t >>> 23);
			t = -927283555;
			buf[1] = (byte) (t >>> 4);
			t = 415784569;
			buf[2] = (byte) (t >>> 22);
			t = -1989411865;
			buf[3] = (byte) (t >>> 16);
			return new String(buf);
		}
	}.toString());

	public static final String NAME_MEMORY = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = -2137314552;
			buf[0] = (byte) (t >>> 17);
			t = -1720724383;
			buf[1] = (byte) (t >>> 22);
			t = 617631159;
			buf[2] = (byte) (t >>> 5);
			t = -955541774;
			buf[3] = (byte) (t >>> 4);
			t = -591008168;
			buf[4] = (byte) (t >>> 5);
			t = -2124980647;
			buf[5] = (byte) (t >>> 6);
			return new String(buf);
		}
	}.toString());

	public static final String NAME_CHUNKS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = 1168706692;
			buf[0] = (byte) (t >>> 10);
			t = 1510856025;
			buf[1] = (byte) (t >>> 22);
			t = 2078035636;
			buf[2] = (byte) (t >>> 5);
			t = 408411036;
			buf[3] = (byte) (t >>> 6);
			t = 1768337942;
			buf[4] = (byte) (t >>> 12);
			t = 1463707974;
			buf[5] = (byte) (t >>> 20);
			return new String(buf);
		}
	}.toString());

	public static final String NAME_ENTITIES = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[8];
			t = -1567585502;
			buf[0] = (byte) (t >>> 9);
			t = 462029360;
			buf[1] = (byte) (t >>> 22);
			t = 2001230607;
			buf[2] = (byte) (t >>> 20);
			t = -1263238748;
			buf[3] = (byte) (t >>> 23);
			t = 1501853511;
			buf[4] = (byte) (t >>> 4);
			t = -56071936;
			buf[5] = (byte) (t >>> 8);
			t = 633169189;
			buf[6] = (byte) (t >>> 8);
			t = -1219041315;
			buf[7] = (byte) (t >>> 9);
			return new String(buf);
		}
	}.toString());

	public static final String CACHE = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[5];
			t = -482687199;
			buf[0] = (byte) (t >>> 9);
			t = -1118974922;
			buf[1] = (byte) (t >>> 5);
			t = 1674369262;
			buf[2] = (byte) (t >>> 6);
			t = 655166886;
			buf[3] = (byte) (t >>> 13);
			t = 1556742207;
			buf[4] = (byte) (t >>> 17);
			return new String(buf);
		}
	}.toString());
	public static final String DOTYML = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = -864501573;
			buf[0] = (byte) (t >>> 2);
			t = -1894745688;
			buf[1] = (byte) (t >>> 8);
			t = -1231392015;
			buf[2] = (byte) (t >>> 23);
			t = 907571050;
			buf[3] = (byte) (t >>> 23);
			return new String(buf);
		}
	}.toString());

	public static final String STATE_MONITORING_ENABLED = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[24];
			t = 203220831;
			buf[0] = (byte) (t >>> 14);
			t = 987565114;
			buf[1] = (byte) (t >>> 14);
			t = -1218368991;
			buf[2] = (byte) (t >>> 16);
			t = 15319326;
			buf[3] = (byte) (t >>> 17);
			t = -1902546490;
			buf[4] = (byte) (t >>> 14);
			t = 1378801201;
			buf[5] = (byte) (t >>> 16);
			t = -280675914;
			buf[6] = (byte) (t >>> 2);
			t = -541885237;
			buf[7] = (byte) (t >>> 11);
			t = -86166961;
			buf[8] = (byte) (t >>> 17);
			t = 1419002578;
			buf[9] = (byte) (t >>> 1);
			t = 1195480121;
			buf[10] = (byte) (t >>> 20);
			t = -1461618978;
			buf[11] = (byte) (t >>> 1);
			t = 924951741;
			buf[12] = (byte) (t >>> 20);
			t = 1809950162;
			buf[13] = (byte) (t >>> 10);
			t = 136734136;
			buf[14] = (byte) (t >>> 2);
			t = 819590811;
			buf[15] = (byte) (t >>> 14);
			t = -1702695733;
			buf[16] = (byte) (t >>> 12);
			t = -75445667;
			buf[17] = (byte) (t >>> 9);
			t = 210212581;
			buf[18] = (byte) (t >>> 4);
			t = -379495854;
			buf[19] = (byte) (t >>> 16);
			t = -1709624556;
			buf[20] = (byte) (t >>> 3);
			t = -959641703;
			buf[21] = (byte) (t >>> 20);
			t = 927569112;
			buf[22] = (byte) (t >>> 10);
			t = 132943873;
			buf[23] = (byte) (t >>> 13);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_MAPPING_ENABLED = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[21];
			t = 740178319;
			buf[0] = (byte) (t >>> 7);
			t = -1875229461;
			buf[1] = (byte) (t >>> 15);
			t = -691007098;
			buf[2] = (byte) (t >>> 2);
			t = 701399395;
			buf[3] = (byte) (t >>> 13);
			t = 43466133;
			buf[4] = (byte) (t >>> 2);
			t = 774091145;
			buf[5] = (byte) (t >>> 24);
			t = 1534474163;
			buf[6] = (byte) (t >>> 22);
			t = -852293142;
			buf[7] = (byte) (t >>> 11);
			t = -80510475;
			buf[8] = (byte) (t >>> 11);
			t = -104827988;
			buf[9] = (byte) (t >>> 18);
			t = -1496186717;
			buf[10] = (byte) (t >>> 17);
			t = 2036786642;
			buf[11] = (byte) (t >>> 12);
			t = -1393282476;
			buf[12] = (byte) (t >>> 21);
			t = 222664509;
			buf[13] = (byte) (t >>> 7);
			t = -978498770;
			buf[14] = (byte) (t >>> 3);
			t = 1102535157;
			buf[15] = (byte) (t >>> 15);
			t = -1333021863;
			buf[16] = (byte) (t >>> 23);
			t = -41296343;
			buf[17] = (byte) (t >>> 18);
			t = 1384017036;
			buf[18] = (byte) (t >>> 8);
			t = -1442631820;
			buf[19] = (byte) (t >>> 11);
			t = -1326345720;
			buf[20] = (byte) (t >>> 10);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_MONITORING_TAB = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[20];
			t = -465199901;
			buf[0] = (byte) (t >>> 6);
			t = -1683559821;
			buf[1] = (byte) (t >>> 19);
			t = 1175632475;
			buf[2] = (byte) (t >>> 20);
			t = -760790292;
			buf[3] = (byte) (t >>> 12);
			t = -585738793;
			buf[4] = (byte) (t >>> 12);
			t = -1292972379;
			buf[5] = (byte) (t >>> 20);
			t = -571989144;
			buf[6] = (byte) (t >>> 3);
			t = -1352934610;
			buf[7] = (byte) (t >>> 14);
			t = -1682810120;
			buf[8] = (byte) (t >>> 22);
			t = 1638347595;
			buf[9] = (byte) (t >>> 18);
			t = -1676920241;
			buf[10] = (byte) (t >>> 7);
			t = -831572009;
			buf[11] = (byte) (t >>> 16);
			t = -591468719;
			buf[12] = (byte) (t >>> 22);
			t = 2010800868;
			buf[13] = (byte) (t >>> 14);
			t = 74340138;
			buf[14] = (byte) (t >>> 16);
			t = 1651964111;
			buf[15] = (byte) (t >>> 1);
			t = -1822553171;
			buf[16] = (byte) (t >>> 6);
			t = 1173547939;
			buf[17] = (byte) (t >>> 3);
			t = -1465711078;
			buf[18] = (byte) (t >>> 4);
			t = -242525373;
			buf[19] = (byte) (t >>> 18);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_SOUND_PLAYS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[17];
			t = 1758498534;
			buf[0] = (byte) (t >>> 1);
			t = 1769262895;
			buf[1] = (byte) (t >>> 16);
			t = -1508269484;
			buf[2] = (byte) (t >>> 20);
			t = 1389200293;
			buf[3] = (byte) (t >>> 3);
			t = 1865609285;
			buf[4] = (byte) (t >>> 15);
			t = -1300711322;
			buf[5] = (byte) (t >>> 10);
			t = 1491876340;
			buf[6] = (byte) (t >>> 7);
			t = 1435842457;
			buf[7] = (byte) (t >>> 7);
			t = 1733588548;
			buf[8] = (byte) (t >>> 20);
			t = -1217581508;
			buf[9] = (byte) (t >>> 23);
			t = -1217031341;
			buf[10] = (byte) (t >>> 10);
			t = -2027008472;
			buf[11] = (byte) (t >>> 16);
			t = 327246998;
			buf[12] = (byte) (t >>> 19);
			t = -1654979654;
			buf[13] = (byte) (t >>> 14);
			t = 159698882;
			buf[14] = (byte) (t >>> 18);
			t = 722618264;
			buf[15] = (byte) (t >>> 4);
			t = -757274899;
			buf[16] = (byte) (t >>> 14);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_MONITORING_POSTED = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[23];
			t = -1628015622;
			buf[0] = (byte) (t >>> 8);
			t = -146179631;
			buf[1] = (byte) (t >>> 20);
			t = -561638867;
			buf[2] = (byte) (t >>> 12);
			t = 586206868;
			buf[3] = (byte) (t >>> 5);
			t = 1505676179;
			buf[4] = (byte) (t >>> 9);
			t = -1328932772;
			buf[5] = (byte) (t >>> 1);
			t = 918024076;
			buf[6] = (byte) (t >>> 23);
			t = 1361075176;
			buf[7] = (byte) (t >>> 6);
			t = 2085994937;
			buf[8] = (byte) (t >>> 2);
			t = -356199882;
			buf[9] = (byte) (t >>> 9);
			t = 976169499;
			buf[10] = (byte) (t >>> 23);
			t = -1015125978;
			buf[11] = (byte) (t >>> 19);
			t = 481581381;
			buf[12] = (byte) (t >>> 22);
			t = 346894604;
			buf[13] = (byte) (t >>> 13);
			t = -245963345;
			buf[14] = (byte) (t >>> 12);
			t = -591022690;
			buf[15] = (byte) (t >>> 2);
			t = 1624436262;
			buf[16] = (byte) (t >>> 12);
			t = 1891478438;
			buf[17] = (byte) (t >>> 24);
			t = -221359683;
			buf[18] = (byte) (t >>> 2);
			t = -1213601050;
			buf[19] = (byte) (t >>> 1);
			t = -568203443;
			buf[20] = (byte) (t >>> 4);
			t = -773487012;
			buf[21] = (byte) (t >>> 4);
			t = 494439564;
			buf[22] = (byte) (t >>> 5);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_MONITORING_LASTTAB = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[25];
			t = 2110623349;
			buf[0] = (byte) (t >>> 5);
			t = 1562846687;
			buf[1] = (byte) (t >>> 22);
			t = -88198922;
			buf[2] = (byte) (t >>> 7);
			t = 2137236724;
			buf[3] = (byte) (t >>> 11);
			t = -10695982;
			buf[4] = (byte) (t >>> 9);
			t = -1758687519;
			buf[5] = (byte) (t >>> 23);
			t = -622177431;
			buf[6] = (byte) (t >>> 3);
			t = 618524144;
			buf[7] = (byte) (t >>> 5);
			t = 1186838540;
			buf[8] = (byte) (t >>> 10);
			t = -609006049;
			buf[9] = (byte) (t >>> 11);
			t = -1655212823;
			buf[10] = (byte) (t >>> 1);
			t = -790678868;
			buf[11] = (byte) (t >>> 17);
			t = 1850046415;
			buf[12] = (byte) (t >>> 21);
			t = -890857647;
			buf[13] = (byte) (t >>> 12);
			t = -1654199215;
			buf[14] = (byte) (t >>> 12);
			t = 1116108082;
			buf[15] = (byte) (t >>> 12);
			t = 1697275146;
			buf[16] = (byte) (t >>> 9);
			t = -321512651;
			buf[17] = (byte) (t >>> 6);
			t = 410436277;
			buf[18] = (byte) (t >>> 22);
			t = -1457720495;
			buf[19] = (byte) (t >>> 14);
			t = -1660121965;
			buf[20] = (byte) (t >>> 22);
			t = 632024332;
			buf[21] = (byte) (t >>> 21);
			t = -330399090;
			buf[22] = (byte) (t >>> 13);
			t = -148699074;
			buf[23] = (byte) (t >>> 11);
			t = -1317949023;
			buf[24] = (byte) (t >>> 23);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_MONITORING_SWITCHNOTIFICATION = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[36];
			t = 473760486;
			buf[0] = (byte) (t >>> 1);
			t = 103237114;
			buf[1] = (byte) (t >>> 12);
			t = -175730980;
			buf[2] = (byte) (t >>> 18);
			t = -52623789;
			buf[3] = (byte) (t >>> 14);
			t = -331540124;
			buf[4] = (byte) (t >>> 6);
			t = 986252741;
			buf[5] = (byte) (t >>> 5);
			t = 564582289;
			buf[6] = (byte) (t >>> 12);
			t = 1862875126;
			buf[7] = (byte) (t >>> 7);
			t = 1854285062;
			buf[8] = (byte) (t >>> 24);
			t = -938783779;
			buf[9] = (byte) (t >>> 11);
			t = 1836338036;
			buf[10] = (byte) (t >>> 16);
			t = -1524954241;
			buf[11] = (byte) (t >>> 3);
			t = 1193972824;
			buf[12] = (byte) (t >>> 20);
			t = 1261868634;
			buf[13] = (byte) (t >>> 12);
			t = -1953046168;
			buf[14] = (byte) (t >>> 12);
			t = -580882226;
			buf[15] = (byte) (t >>> 1);
			t = -2098987768;
			buf[16] = (byte) (t >>> 20);
			t = 194836076;
			buf[17] = (byte) (t >>> 14);
			t = 439475714;
			buf[18] = (byte) (t >>> 10);
			t = 23684856;
			buf[19] = (byte) (t >>> 16);
			t = 386284150;
			buf[20] = (byte) (t >>> 7);
			t = -219681393;
			buf[21] = (byte) (t >>> 2);
			t = -2038356465;
			buf[22] = (byte) (t >>> 20);
			t = 1379487927;
			buf[23] = (byte) (t >>> 2);
			t = 1460070263;
			buf[24] = (byte) (t >>> 12);
			t = 968868196;
			buf[25] = (byte) (t >>> 18);
			t = -1491518964;
			buf[26] = (byte) (t >>> 7);
			t = 564512196;
			buf[27] = (byte) (t >>> 18);
			t = 1718442195;
			buf[28] = (byte) (t >>> 24);
			t = -1939233717;
			buf[29] = (byte) (t >>> 10);
			t = 1178000301;
			buf[30] = (byte) (t >>> 20);
			t = -869682443;
			buf[31] = (byte) (t >>> 21);
			t = 267506631;
			buf[32] = (byte) (t >>> 10);
			t = 569484739;
			buf[33] = (byte) (t >>> 10);
			t = 1589787071;
			buf[34] = (byte) (t >>> 2);
			t = -1763649145;
			buf[35] = (byte) (t >>> 20);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_PLAYER_HOTBAR = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[19];
			t = -744560878;
			buf[0] = (byte) (t >>> 19);
			t = 1195601628;
			buf[1] = (byte) (t >>> 20);
			t = 102196339;
			buf[2] = (byte) (t >>> 20);
			t = 1955923700;
			buf[3] = (byte) (t >>> 24);
			t = -145568807;
			buf[4] = (byte) (t >>> 9);
			t = -378015019;
			buf[5] = (byte) (t >>> 19);
			t = 1946572558;
			buf[6] = (byte) (t >>> 4);
			t = 693844686;
			buf[7] = (byte) (t >>> 14);
			t = 2008062879;
			buf[8] = (byte) (t >>> 15);
			t = -1408772198;
			buf[9] = (byte) (t >>> 4);
			t = -1520020790;
			buf[10] = (byte) (t >>> 1);
			t = -1690747585;
			buf[11] = (byte) (t >>> 15);
			t = 292793710;
			buf[12] = (byte) (t >>> 19);
			t = -1271298681;
			buf[13] = (byte) (t >>> 23);
			t = 1459112291;
			buf[14] = (byte) (t >>> 20);
			t = 417874415;
			buf[15] = (byte) (t >>> 17);
			t = 1105642825;
			buf[16] = (byte) (t >>> 9);
			t = -1239591633;
			buf[17] = (byte) (t >>> 20);
			t = 1927395583;
			buf[18] = (byte) (t >>> 24);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_PLAYER_SHIFT = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[18];
			t = 1424363431;
			buf[0] = (byte) (t >>> 17);
			t = -6637053;
			buf[1] = (byte) (t >>> 7);
			t = 56689330;
			buf[2] = (byte) (t >>> 16);
			t = 1403159319;
			buf[3] = (byte) (t >>> 19);
			t = -1801891188;
			buf[4] = (byte) (t >>> 14);
			t = -1089763962;
			buf[5] = (byte) (t >>> 14);
			t = -1911106329;
			buf[6] = (byte) (t >>> 21);
			t = -986740520;
			buf[7] = (byte) (t >>> 1);
			t = -445659621;
			buf[8] = (byte) (t >>> 4);
			t = -1025259373;
			buf[9] = (byte) (t >>> 11);
			t = 185753802;
			buf[10] = (byte) (t >>> 1);
			t = -1375090487;
			buf[11] = (byte) (t >>> 10);
			t = 973833712;
			buf[12] = (byte) (t >>> 14);
			t = 966786676;
			buf[13] = (byte) (t >>> 23);
			t = -499015070;
			buf[14] = (byte) (t >>> 10);
			t = -1100381053;
			buf[15] = (byte) (t >>> 16);
			t = -1951202664;
			buf[16] = (byte) (t >>> 15);
			t = 683287755;
			buf[17] = (byte) (t >>> 15);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_PLAYER_SCROLL = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[19];
			t = 1749896091;
			buf[0] = (byte) (t >>> 3);
			t = 1951988046;
			buf[1] = (byte) (t >>> 24);
			t = 540079980;
			buf[2] = (byte) (t >>> 15);
			t = 880368908;
			buf[3] = (byte) (t >>> 6);
			t = -1596730985;
			buf[4] = (byte) (t >>> 2);
			t = 1626126905;
			buf[5] = (byte) (t >>> 10);
			t = 1483715008;
			buf[6] = (byte) (t >>> 2);
			t = -158637606;
			buf[7] = (byte) (t >>> 11);
			t = -469433979;
			buf[8] = (byte) (t >>> 2);
			t = 791345329;
			buf[9] = (byte) (t >>> 21);
			t = 1254955339;
			buf[10] = (byte) (t >>> 6);
			t = 957061011;
			buf[11] = (byte) (t >>> 23);
			t = -309282519;
			buf[12] = (byte) (t >>> 10);
			t = 486133880;
			buf[13] = (byte) (t >>> 22);
			t = -81867375;
			buf[14] = (byte) (t >>> 19);
			t = -1833352303;
			buf[15] = (byte) (t >>> 15);
			t = 935705624;
			buf[16] = (byte) (t >>> 23);
			t = 1904318896;
			buf[17] = (byte) (t >>> 2);
			t = 1826833532;
			buf[18] = (byte) (t >>> 24);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_PLAYER_HEIGHT_CURRENT = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[27];
			t = 970766768;
			buf[0] = (byte) (t >>> 23);
			t = -1237686894;
			buf[1] = (byte) (t >>> 15);
			t = -172973224;
			buf[2] = (byte) (t >>> 15);
			t = 1406618572;
			buf[3] = (byte) (t >>> 12);
			t = -483502740;
			buf[4] = (byte) (t >>> 19);
			t = 98278739;
			buf[5] = (byte) (t >>> 21);
			t = -618527296;
			buf[6] = (byte) (t >>> 2);
			t = 1479947052;
			buf[7] = (byte) (t >>> 15);
			t = 158696474;
			buf[8] = (byte) (t >>> 10);
			t = 2045997048;
			buf[9] = (byte) (t >>> 24);
			t = 434841936;
			buf[10] = (byte) (t >>> 11);
			t = -1806081307;
			buf[11] = (byte) (t >>> 1);
			t = 1220246647;
			buf[12] = (byte) (t >>> 18);
			t = 879240485;
			buf[13] = (byte) (t >>> 16);
			t = 202335726;
			buf[14] = (byte) (t >>> 8);
			t = -1865156891;
			buf[15] = (byte) (t >>> 17);
			t = -2086063224;
			buf[16] = (byte) (t >>> 7);
			t = -818476847;
			buf[17] = (byte) (t >>> 1);
			t = -1192671214;
			buf[18] = (byte) (t >>> 17);
			t = -1761018513;
			buf[19] = (byte) (t >>> 23);
			t = 1983768979;
			buf[20] = (byte) (t >>> 20);
			t = -1152730471;
			buf[21] = (byte) (t >>> 7);
			t = -1122204203;
			buf[22] = (byte) (t >>> 14);
			t = -225538489;
			buf[23] = (byte) (t >>> 5);
			t = -1429491292;
			buf[24] = (byte) (t >>> 17);
			t = -440687331;
			buf[25] = (byte) (t >>> 18);
			t = 1686754133;
			buf[26] = (byte) (t >>> 10);
			return new String(buf);
		}
	}.toString());
	public static final String STATE_PLAYER_HEIGHT_CHANGING = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[28];
			t = -1904637152;
			buf[0] = (byte) (t >>> 21);
			t = 1318598152;
			buf[1] = (byte) (t >>> 21);
			t = -647899780;
			buf[2] = (byte) (t >>> 16);
			t = -1566575151;
			buf[3] = (byte) (t >>> 2);
			t = -430346487;
			buf[4] = (byte) (t >>> 14);
			t = -457680808;
			buf[5] = (byte) (t >>> 18);
			t = -1429880223;
			buf[6] = (byte) (t >>> 10);
			t = -402431583;
			buf[7] = (byte) (t >>> 11);
			t = 355194398;
			buf[8] = (byte) (t >>> 4);
			t = -1768382875;
			buf[9] = (byte) (t >>> 6);
			t = -2108372060;
			buf[10] = (byte) (t >>> 9);
			t = 1917495121;
			buf[11] = (byte) (t >>> 24);
			t = 1659210930;
			buf[12] = (byte) (t >>> 20);
			t = 740743714;
			buf[13] = (byte) (t >>> 6);
			t = 426092915;
			buf[14] = (byte) (t >>> 22);
			t = 1839508595;
			buf[15] = (byte) (t >>> 18);
			t = 903925610;
			buf[16] = (byte) (t >>> 9);
			t = 1195797319;
			buf[17] = (byte) (t >>> 3);
			t = 597689582;
			buf[18] = (byte) (t >>> 19);
			t = 1583095720;
			buf[19] = (byte) (t >>> 17);
			t = 619108579;
			buf[20] = (byte) (t >>> 6);
			t = -1337124960;
			buf[21] = (byte) (t >>> 13);
			t = -1683536358;
			buf[22] = (byte) (t >>> 4);
			t = -1392829529;
			buf[23] = (byte) (t >>> 6);
			t = 284125146;
			buf[24] = (byte) (t >>> 8);
			t = 1969824812;
			buf[25] = (byte) (t >>> 16);
			t = 280457007;
			buf[26] = (byte) (t >>> 15);
			t = -168709193;
			buf[27] = (byte) (t >>> 7);
			return new String(buf);
		}
	}.toString());

	public static final String NAME = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[5];
			t = 1160713122;
			buf[0] = (byte) (t >>> 20);
			t = 576276884;
			buf[1] = (byte) (t >>> 14);
			t = -839625340;
			buf[2] = (byte) (t >>> 2);
			t = 1379080448;
			buf[3] = (byte) (t >>> 11);
			t = 720274948;
			buf[4] = (byte) (t >>> 13);
			return new String(buf);
		}
	}.toString());

	public static final String M = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[1];
			t = -669053512;
			buf[0] = (byte) (t >>> 5);
			return new String(buf);
		}
	}.toString());

	public static final String SPACE = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[1];
			t = -1897613654;
			buf[0] = (byte) (t >>> 7);
			return new String(buf);
		}
	}.toString().replaceAll(Info.M, ""));

	public static final String ACCESS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = 2084489993;
			buf[0] = (byte) (t >>> 3);
			t = -2095550737;
			buf[1] = (byte) (t >>> 19);
			t = -95204584;
			buf[2] = (byte) (t >>> 3);
			t = 1498938506;
			buf[3] = (byte) (t >>> 22);
			t = 1944106338;
			buf[4] = (byte) (t >>> 24);
			t = 938377211;
			buf[5] = (byte) (t >>> 13);
			return new String(buf);
		}
	}.toString());

	public static final String MONITOR = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[7];
			t = -531739231;
			buf[0] = (byte) (t >>> 5);
			t = -383402328;
			buf[1] = (byte) (t >>> 10);
			t = -608753337;
			buf[2] = (byte) (t >>> 22);
			t = 569829074;
			buf[3] = (byte) (t >>> 1);
			t = 966146586;
			buf[4] = (byte) (t >>> 7);
			t = 887847717;
			buf[5] = (byte) (t >>> 11);
			t = -1294874222;
			buf[6] = (byte) (t >>> 10);
			return new String(buf);
		}
	}.toString());

	public static final String MONITOR_TITLE = MONITOR + (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = -1876022956;
			buf[0] = (byte) (t >>> 16);
			t = 1652270615;
			buf[1] = (byte) (t >>> 11);
			t = -1768545131;
			buf[2] = (byte) (t >>> 20);
			t = 362234930;
			buf[3] = (byte) (t >>> 12);
			t = 1733148888;
			buf[4] = (byte) (t >>> 1);
			t = 974746653;
			buf[5] = (byte) (t >>> 14);
			return new String(buf);
		}
	}.toString());

	public static final String MONITOR_MAP = MONITOR + (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = -336943658;
			buf[0] = (byte) (t >>> 5);
			t = -489748778;
			buf[1] = (byte) (t >>> 4);
			t = -2085665251;
			buf[2] = (byte) (t >>> 4);
			t = -1910778739;
			buf[3] = (byte) (t >>> 21);
			return new String(buf);
		}
	}.toString());

	public static final String MONITOR_ENVIRONMENT = MONITOR + (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[12];
			t = -1186189730;
			buf[0] = (byte) (t >>> 8);
			t = 333014797;
			buf[1] = (byte) (t >>> 14);
			t = 1373850042;
			buf[2] = (byte) (t >>> 2);
			t = 1610827500;
			buf[3] = (byte) (t >>> 1);
			t = -630844598;
			buf[4] = (byte) (t >>> 3);
			t = -1370854923;
			buf[5] = (byte) (t >>> 21);
			t = -1803847199;
			buf[6] = (byte) (t >>> 11);
			t = -1130651120;
			buf[7] = (byte) (t >>> 14);
			t = -2031242307;
			buf[8] = (byte) (t >>> 13);
			t = -1892006316;
			buf[9] = (byte) (t >>> 4);
			t = 632932628;
			buf[10] = (byte) (t >>> 18);
			t = -589872536;
			buf[11] = (byte) (t >>> 12);
			return new String(buf);
		}
	}.toString());

	public static final String ACT = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = 321307301;
			buf[0] = (byte) (t >>> 9);
			t = -163622176;
			buf[1] = (byte) (t >>> 20);
			t = -736171688;
			buf[2] = (byte) (t >>> 9);
			return new String(buf);
		}
	}.toString());

	public static final String RELOAD = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = -1579384356;
			buf[0] = (byte) (t >>> 14);
			t = 1698798336;
			buf[1] = (byte) (t >>> 24);
			t = -53030939;
			buf[2] = (byte) (t >>> 12);
			t = -18780259;
			buf[3] = (byte) (t >>> 8);
			t = -1335799703;
			buf[4] = (byte) (t >>> 16);
			t = -1019112479;
			buf[5] = (byte) (t >>> 10);
			return new String(buf);
		}
	}.toString());

	public static final String REACT_DOT = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = 1610467996;
			buf[0] = (byte) (t >>> 10);
			t = 1701886658;
			buf[1] = (byte) (t >>> 24);
			t = 649032071;
			buf[2] = (byte) (t >>> 2);
			t = -1864836535;
			buf[3] = (byte) (t >>> 14);
			t = -1322848024;
			buf[4] = (byte) (t >>> 1);
			t = 1327880475;
			buf[5] = (byte) (t >>> 13);
			return new String(buf);
		}
	}.toString());

	public static final String TPS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = 1459962102;
			buf[0] = (byte) (t >>> 12);
			t = -584576968;
			buf[1] = (byte) (t >>> 15);
			t = 924120989;
			buf[2] = (byte) (t >>> 14);
			return new String(buf);
		}
	}.toString());

	public static final String TICK = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = 891986292;
			buf[0] = (byte) (t >>> 11);
			t = 1883850991;
			buf[1] = (byte) (t >>> 16);
			t = 1393158264;
			buf[2] = (byte) (t >>> 5);
			t = -987137669;
			buf[3] = (byte) (t >>> 13);
			return new String(buf);
		}
	}.toString());

	public static final String TIU = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = 1162782374;
			buf[0] = (byte) (t >>> 20);
			t = 1025914164;
			buf[1] = (byte) (t >>> 18);
			t = 824876138;
			buf[2] = (byte) (t >>> 15);
			return new String(buf);
		}
	}.toString());

	public static final String MEM = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = 624181438;
			buf[0] = (byte) (t >>> 18);
			t = -2050923427;
			buf[1] = (byte) (t >>> 4);
			t = 352724609;
			buf[2] = (byte) (t >>> 7);
			return new String(buf);
		}
	}.toString());

	public static final String FREEMEM = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[7];
			t = -1981724987;
			buf[0] = (byte) (t >>> 8);
			t = -943043943;
			buf[1] = (byte) (t >>> 13);
			t = -1550186306;
			buf[2] = (byte) (t >>> 5);
			t = -1567676684;
			buf[3] = (byte) (t >>> 23);
			t = 1392135590;
			buf[4] = (byte) (t >>> 8);
			t = -1498528398;
			buf[5] = (byte) (t >>> 8);
			t = -2058487804;
			buf[6] = (byte) (t >>> 16);
			return new String(buf);
		}
	}.toString());

	public static final String MAXMEM = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = 1296892993;
			buf[0] = (byte) (t >>> 16);
			t = -215952962;
			buf[1] = (byte) (t >>> 15);
			t = 828633374;
			buf[2] = (byte) (t >>> 18);
			t = 1569300616;
			buf[3] = (byte) (t >>> 13);
			t = -1537888303;
			buf[4] = (byte) (t >>> 20);
			t = -1500193597;
			buf[5] = (byte) (t >>> 23);
			return new String(buf);
		}
	}.toString());

	public static final String ALLOCMEM = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[8];
			t = 746095637;
			buf[0] = (byte) (t >>> 4);
			t = 1007220889;
			buf[1] = (byte) (t >>> 1);
			t = 348362733;
			buf[2] = (byte) (t >>> 20);
			t = -1478574362;
			buf[3] = (byte) (t >>> 23);
			t = 438062260;
			buf[4] = (byte) (t >>> 19);
			t = -1925742906;
			buf[5] = (byte) (t >>> 18);
			t = -1464445763;
			buf[6] = (byte) (t >>> 21);
			t = 815518404;
			buf[7] = (byte) (t >>> 17);
			return new String(buf);
		}
	}.toString());

	public static final String MAHS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = 865299533;
			buf[0] = (byte) (t >>> 14);
			t = -1600078067;
			buf[1] = (byte) (t >>> 23);
			t = 305099125;
			buf[2] = (byte) (t >>> 22);
			t = 606288205;
			buf[3] = (byte) (t >>> 2);
			return new String(buf);
		}
	}.toString());

	public static final String CHK = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = -313918195;
			buf[0] = (byte) (t >>> 2);
			t = 348457217;
			buf[1] = (byte) (t >>> 5);
			t = -1511038672;
			buf[2] = (byte) (t >>> 23);
			return new String(buf);
		}
	}.toString());

	public static final String CHKS = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[4];
			t = 2133777679;
			buf[0] = (byte) (t >>> 2);
			t = 1380412299;
			buf[1] = (byte) (t >>> 19);
			t = 1802579052;
			buf[2] = (byte) (t >>> 10);
			t = -693742740;
			buf[3] = (byte) (t >>> 17);
			return new String(buf);
		}
	}.toString());

	public static final String ENT = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[3];
			t = -2129848373;
			buf[0] = (byte) (t >>> 10);
			t = 754268825;
			buf[1] = (byte) (t >>> 10);
			t = 1520568700;
			buf[2] = (byte) (t >>> 19);
			return new String(buf);
		}
	}.toString());

	public static final String ENTLIV = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[6];
			t = 290639644;
			buf[0] = (byte) (t >>> 22);
			t = 261540307;
			buf[1] = (byte) (t >>> 5);
			t = 356563374;
			buf[2] = (byte) (t >>> 20);
			t = -1517884829;
			buf[3] = (byte) (t >>> 3);
			t = -431384926;
			buf[4] = (byte) (t >>> 16);
			t = 1406514223;
			buf[5] = (byte) (t >>> 14);
			return new String(buf);
		}
	}.toString());

	public static final String ENTDROP = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[7];
			t = -1871672717;
			buf[0] = (byte) (t >>> 9);
			t = -1435132748;
			buf[1] = (byte) (t >>> 19);
			t = 621979415;
			buf[2] = (byte) (t >>> 11);
			t = 142746985;
			buf[3] = (byte) (t >>> 21);
			t = 1383882402;
			buf[4] = (byte) (t >>> 24);
			t = 799096461;
			buf[5] = (byte) (t >>> 10);
			t = -612612863;
			buf[6] = (byte) (t >>> 4);
			return new String(buf);
		}
	}.toString());

	public static final String ENTTILE = (new Object()
	{
		int t;

		@Override
		public String toString()
		{
			byte[] buf = new byte[7];
			t = 693940781;
			buf[0] = (byte) (t >>> 3);
			t = 1693124625;
			buf[1] = (byte) (t >>> 20);
			t = -593376625;
			buf[2] = (byte) (t >>> 5);
			t = -56017189;
			buf[3] = (byte) (t >>> 17);
			t = -733369101;
			buf[4] = (byte) (t >>> 16);
			t = 1785070331;
			buf[5] = (byte) (t >>> 19);
			t = 1095272623;
			buf[6] = (byte) (t >>> 5);
			return new String(buf);
		}
	}.toString());
}
