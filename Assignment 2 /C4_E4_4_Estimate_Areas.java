
public class C4_E4_4_Estimate_Areas {

	public static void main(String[] args) {
		final double radius = 6371.01;
		 double lat_Ch = 35.2270869;		//Charlotte //x1
		 double lon_Ch = -80.8431267;	//y1
		 double lat_Sav = 32.0835407;		//x2//Savannah
		 double lon_Sav = -81.0998342;	//y2
		 double lat_Orl = 28.5383355;		//x3 //Orlando
		 double lon_Orl = -81.3792365;	//y3
		 double lat_At = 33.7489954;		//x4//Atlanta
		 double lon_At = -84.3879824;	//y4

		 //Converting degrees to radians 
		 double lat_Ch_r = Math.toRadians(lat_Ch);
		 double lon_Ch_r = Math.toRadians(lon_Ch);
		 double lat_Sav_r = Math.toRadians(lat_Sav);
		 double lon_Sav_r = Math.toRadians(lon_Sav);
		 double lat_Orl_r = Math.toRadians(lat_Orl);
		 double lon_Orl_r = Math.toRadians(lon_Orl);
		 double lat_At_r = Math.toRadians(lat_At);
		 double lon_At_r = Math.toRadians(lon_At);
		 
		 //Calculating distance between cities
		 double dist_Ch_Sav = radius * Math.acos(Math.sin(lat_Ch_r) * Math.sin(lat_Sav_r) + 
				 Math.cos(lat_Ch_r) * Math.cos(lat_Sav_r) * Math.cos(lon_Sav_r - lon_Ch_r));		//dist between Ch and Sav
		 System.out.println("Distance between Charlotte and Savannah = " + dist_Ch_Sav);
		 double dist_Sav_Orl = radius * Math.acos(Math.sin(lat_Sav_r) * Math.sin(lat_Orl_r) + 	//dist between Sav and Orl
				 Math.cos(lat_Sav_r) * Math.cos(lat_Orl_r) * Math.cos(lon_Orl_r - lon_Sav_r));
		 System.out.println("Distance between Savannah and Orlando = " + dist_Sav_Orl);
		 double dist_Orl_At = radius * Math.acos(Math.sin(lat_Orl_r) * Math.sin(lat_At_r) + 	//dist between Orl and At
				 Math.cos(lat_Orl_r) * Math.cos(lat_At_r) * Math.cos(lon_At_r - lon_Orl_r));
		 System.out.println("Distance between Orlando and Atlanta = " + dist_Orl_At);
		 double dist_At_Ch = radius * Math.acos(Math.sin(lat_At_r) * Math.sin(lat_Ch_r) + 	//dist between At and Ch
				 Math.cos(lat_At_r) * Math.cos(lat_Ch_r) * Math.cos(lon_Ch_r - lon_At_r));
		 System.out.println("Distance between Atlanta and Charlotte = " + dist_At_Ch);
		 
		 //Calculating area of polygon by dividing it into two triangles
		 double dist_At_Sav = radius *Math.acos(Math.sin(lat_At_r) * Math.sin(lat_Sav_r) + 
				 Math.cos(lat_At_r) * Math.cos(lat_Sav_r) * Math.cos(lon_Sav_r - lon_At_r)); //distance between At and Sav
		 System.out.println("Distance between Atlanta and Savannah = " + dist_At_Sav);
		 
		 //Area of triangle enclosed by Charlotte, Savannah and Atlanta
		 double s1 = (dist_Ch_Sav + dist_At_Sav + dist_At_Ch) / 2;
		 System.out.println("s1 = " + s1);
		 
		 double area_1 = Math.sqrt(s1 * (s1 - dist_Ch_Sav) * (s1 - dist_At_Sav) * (s1 - dist_At_Ch));
		 System.out.println("Area enclosed by Atlanta, Charlotte and Savannah = " + area_1);
		 
		 //Area of triangle enclosed by Atlanta, Orlando and Savannah
		 double s2 = (dist_At_Sav + dist_Sav_Orl + dist_Orl_At) / 2;
		 System.out.println("S2 = " + s2);
		 
		 double area_2 = Math.sqrt(s2 * (s2 - dist_At_Sav) * (s2 - dist_Sav_Orl) * (s2 - dist_Orl_At));
		 System.out.println("Area enclosed by Atlanta, Savannah and Orlando = "+ area_2);
		 
		 System.out.println("AREA ENCLOSED BY THE FOUR CITIES = " + (area_1 + area_2) + " SQUARE KM.");
		 
		 
		 
		 
		 
	}

}
