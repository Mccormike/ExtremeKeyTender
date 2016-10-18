package mekel.model;

import java.util.ArrayList;

public class Game {
	
	private String name;
	
	private String iniLocation;
	
	private ArrayList<Profile> profiles;
	
	private String iconLocation;
	
	private String bgLocation;
	
	public Game(final String name, final String iniLocation, final String iconLocation,
			final String bgLocation) {
		this.name = name;
		this.iniLocation = iniLocation;
		this.iconLocation = iconLocation;
		this.bgLocation = bgLocation;
		profiles = new ArrayList<Profile>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIniLocation() {
		return iniLocation;
	}

	public void setIniLocation(String iniLocation) {
		this.iniLocation = iniLocation;
	}

	public ArrayList<Profile> getProfiles() {
		return profiles;
	}

	public void addProfile(Profile profile) {
		this.profiles.add(profile);
	}

	public String getIconLocation() {
		return iconLocation;
	}

	public void setIconLocation(String iconLocation) {
		this.iconLocation = iconLocation;
	}

	public String getBgLocation() {
		return bgLocation;
	}

	public void setBgLocation(String bgLocation) {
		this.bgLocation = bgLocation;
	}
	

}
