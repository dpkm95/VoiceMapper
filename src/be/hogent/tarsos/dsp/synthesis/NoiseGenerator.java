/*
*      _______                       _____   _____ _____  
*     |__   __|                     |  __ \ / ____|  __ \ 
*        | | __ _ _ __ ___  ___  ___| |  | | (___ | |__) |
*        | |/ _` | '__/ __|/ _ \/ __| |  | |\___ \|  ___/ 
*        | | (_| | |  \__ \ (_) \__ \ |__| |____) | |     
*        |_|\__,_|_|  |___/\___/|___/_____/|_____/|_|     
*                                                         
* -----------------------------------------------------------
*
*  TarsosDSP is developed by Joren Six at 
*  The Royal Academy of Fine Arts & Royal Conservatory,
*  University College Ghent,
*  Hoogpoort 64, 9000 Ghent - Belgium
*  
*  http://tarsos.0110.be/tag/TarsosDSP
*  https://github.com/JorenSix/TarsosDSP
*  http://tarsos.0110.be/releases/TarsosDSP/
* 
*/
package be.hogent.tarsos.dsp.synthesis;

import be.hogent.tarsos.dsp.AudioEvent;
import be.hogent.tarsos.dsp.AudioProcessor;

public class NoiseGenerator implements AudioProcessor{
	
	private double gain;
	
	public NoiseGenerator(){
		this(1.0);
	}
	
	public NoiseGenerator(double gain){
		this.gain = gain;
	}

	@Override
	public boolean process(AudioEvent audioEvent) {
		float[] buffer = audioEvent.getFloatBuffer();
		for(int i = 0 ; i < buffer.length ; i++){
			buffer[i] += (float) (Math.random() * gain);
		}
		return true;
	}

	@Override
	public void processingFinished() {
	}
	
	

}
