import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static Sistema s;

	public static void main(String[] args) {
		s = new Sistema();
		sc = new Scanner(System.in);
		String menu = "1 - Cadastrar cliente\n2 - Retirar cliente\n3 - Buscas";

		while (true) {
			
			System.out.println(menu);
			boolean menuS = false;
			int menuOp = 0;
			
			while (!menuS) {
				menuS = true;
				System.out.print("Digite a op��o desejada: ");

				try {
					menuOp = Integer.parseInt(sc.nextLine());
					if(menuOp == 1) {
						
						System.out.println("\n1 - S�cio\n2 - N�o S�cio");
						int op1 = 0;

						boolean idadeS = false;
						boolean op2 = false;
						boolean generoS = false;

						while (!op2) {
							op2 = true;
							System.out.print("\nDigite a op��o desejada: ");

							try {
								op1 = Integer.parseInt(sc.nextLine());

							} catch (NumberFormatException e) {
								System.out.println("Por favor, digite apenas n�meros!");
								op2 = false;
							}

							if (op1 == 1) {
								System.out.print("\nDigite CPF do cliente: ");
								String cpf = sc.nextLine();
								int idade = 0;
								int generoN = 0;
								String genero = null;

								while (!idadeS) {
									idadeS = true;
									System.out.print("\nDigite a sua idade: ");

									try {
										idade = Integer.parseInt(sc.nextLine());

									} catch (NumberFormatException e) {
										System.out.println("Por favor, digite apenas n�meros!");
										idadeS = false;
									}
								}

								while(!generoS) {
									System.out.println("1 - Masculino\n2 - Feminino");
									System.out.print("\nDigite a op��o do seu g�nero: ");
									
									try {
										generoN = Integer.parseInt(sc.nextLine());
										if(generoN == 1) {
											genero = "Masculino";
											generoS = true;
										} else if(generoN == 2) {
											genero = "Feminino";
											generoS = true;
										} else {
											System.out.println("Op��o inv�lida!");
											generoS = false;
										}

									} catch (NumberFormatException e) {
										System.out.println("Por favor, digite apenas n�meros!");
										generoS = false;
									}
									}

								System.out.print("\nDigite o seu n�mero de s�cio: ");
								String numSocio = sc.nextLine();

								Cliente c = new ClienteSocio(cpf, idade, genero, numSocio);
								s.registrarEntradaCliente(c);
							} else if (op1 == 2) {
								System.out.print("\nDigite o seu CPF: ");
								String cpf = sc.nextLine();
								int idade = 0;
								int generoN = 0;
								String genero = null;
								
								while (!idadeS) {
									idadeS = true;
									System.out.print("\nDigite a sua idade: ");

									try {
										idade = Integer.parseInt(sc.nextLine());

									} catch (NumberFormatException e) {
										System.out.println("Por favor, digite apenas n�meros!");
										idadeS = false;
									}
								}
								
								while(!generoS) {
								System.out.println("1 - Masculino\n2 - Feminino");
								System.out.print("\nDigite a op��o do seu g�nero: ");
								
								try {
									generoN = Integer.parseInt(sc.nextLine());
									if(generoN == 1) {
										genero = "Masculino";
										generoS = true;
									} else if(generoN == 2) {
										genero = "Feminino";
										generoS = true;
									} else {
										System.out.println("Op��o inv�lida!");
										generoS = false;
									}

								} catch (NumberFormatException e) {
									System.out.println("Por favor, digite apenas n�meros!");
									generoS = false;
								}
								}

								Cliente c = new Cliente(cpf, idade, genero);
								s.registrarEntradaCliente(c);

							} 
						}
						
					} else if(menuOp == 2){
						
						System.out.print("Digite o CPF do cliente: " );
						String cpf = sc.nextLine();
						
						boolean saida = s.registrarSaidaCliente(cpf);
						if(saida) {
							System.out.println("O cliente " + cpf + " saiu!");
						}
						
					} else if(menuOp == 3) {
						
						boolean buscaOp = false;
						
						while(!buscaOp) {
						boolean buscaOp2 = false;
						int buscaOp3 = 0;
						while(!buscaOp2) {
							System.out.println("1 - Consultar clientes no bar"
									+ "\n2 - Ver se cliente est� no bar"
									+ "\n3 - Distribui��o por g�nero"
									+ "\n4 - Distribui��o por s�cio"
									+ "\n0 - Sair");
							System.out.print("\nDigite a op��o desejada: ");
							
							try {
								buscaOp3 = Integer.parseInt(sc.nextLine());
								if(buscaOp3 == 1) {
									
								} else if(buscaOp3 == 2) {
									
								} else if(buscaOp3 == 3) {
									
								} else if(buscaOp3 == 4) {
									
								} else if(buscaOp3 == 0) {
									
								} else {
									System.out.println("Op��o inv�lida!");
								}

							} catch (NumberFormatException e) {
								System.out.println("Por favor, digite apenas n�meros!");
								buscaOp2 = false;
							}
							}
						
						}
						
					}

				} catch (NumberFormatException e) {
					System.out.println("Por favor, digite apenas n�meros!");
					menuS = false;
				}
			}
			
			
			
			
		}

	}

}
