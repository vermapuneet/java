package com.puneet.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.puneet.SpringAnno")
public class Appconfig 
{	/*@Bean
		public Samsung getphone()
				{
					return new Samsung();
				}
		@Bean
		public MobileProcessor getProcessor()
			{
					return new Mediatek();
			}
*/
}
