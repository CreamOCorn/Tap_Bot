package what;

import java.util.Optional;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.audio.AudioConnection;
import org.javacord.api.entity.activity.ActivityType;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.channel.VoiceChannel;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.UserStatus;

public class OkbutParantap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Token
        DiscordApi api = new DiscordApiBuilder().setToken("ODk0Mzc5NzgyNzg2MTU0NTQ4.GpByT6.5zJpxASDqoZeVerK2kAr6Rcj7N6hJeeWVgC5Rc")
                .login().join();

        // things
        api.updateActivity(ActivityType.PLAYING, "with anime thighs");
        api.updateStatus(UserStatus.IDLE);
        
        //variable
        
        
        //acc thing
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("i am ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("i am ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("I AM ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("I AM ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("I am ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("I am ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("I Am ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("I Am ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("I aM ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("I aM ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIAm -> {
            if (eventHiIAm.getMessageContent().contains("i AM ") 
            		&& eventHiIAm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIAm.getMessageContent().split("i AM ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIAm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIAm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiImm -> {
            if (eventHiImm.getMessageContent().contains("i'm ") 
            		&& eventHiImm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiImm.getMessageContent().split("i'm ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiImm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiImm.getChannel().sendMessage("im dad");	
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiImm -> {
            if (eventHiImm.getMessageContent().contains("I'm ") 
            		&& eventHiImm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiImm.getMessageContent().split("I'm ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiImm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiImm.getChannel().sendMessage("im dad");	
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiImm -> {
            if (eventHiImm.getMessageContent().contains("i'M ") 
            		&& eventHiImm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiImm.getMessageContent().split("i'M ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiImm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiImm.getChannel().sendMessage("im dad");	
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiImm -> {
            if (eventHiImm.getMessageContent().contains("I'M ") 
            		&& eventHiImm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiImm.getMessageContent().split("I'M ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiImm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiImm.getChannel().sendMessage("im dad");	
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIm -> {
            if (eventHiIm.getMessageContent().contains("im ") 
            		&& eventHiIm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIm.getMessageContent().split("im ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIm -> {
            if (eventHiIm.getMessageContent().contains("Im ") 
            		&& eventHiIm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIm.getMessageContent().split("Im ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventHiIm -> {
            if (eventHiIm.getMessageContent().contains("iM ") 
            		&& eventHiIm.getMessageAuthor().getId() != 894379782786154548L) {
                try {
                	String[] msgArr;
                	String name;
                	msgArr = eventHiIm.getMessageContent().split("iM ");
                	name = msgArr[1];
                	Thread.sleep(1100);
                	eventHiIm.getChannel().sendMessage("hi " + name);
                    Thread.sleep(700);	
                    eventHiIm.getChannel().sendMessage("im dad");
                } catch (InterruptedException e) {
                }
            }
        });
        api.addMessageCreateListener(eventJoin -> {
            if (eventJoin.getMessageContent().contains("parantap join vc") 
            		&& eventJoin.getMessageAuthor().getId() != 894379782786154548L) {
            	Optional<ServerVoiceChannel> channel = eventJoin.getMessageAuthor().getConnectedVoiceChannel();
		        if (channel.isPresent()) {
		        	channel.get().connect().thenAcceptAsync(connection -> {
		        });
				}
            } else if (eventJoin.getMessageContent().contains("parantap leave vc") 
            		&& eventJoin.getMessageAuthor().getId() != 894379782786154548L) {
            	Server server = eventJoin.getServer().get();
                AudioConnection voiceChannel = server.getAudioConnection().get();
                voiceChannel.close();

            }
       });
	}  
}
