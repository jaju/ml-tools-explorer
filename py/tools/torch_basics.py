import torch
import torch.nn as nn
import torch.optim as optim

# Create a 1-D vector of 10 random floats
rnd_vec = torch.randn(10)
print(type(rnd_vec))
print(rnd_vec)

# Create views on the above rnd_vec
view_vec = rnd_vec.view(-1)
print(view_vec)

view_matrix = rnd_vec.view(5, 2)
print(view_matrix)

print(view_matrix.flatten())

view_3d = rnd_vec.view(2, 5, 1)
print(view_3d)


# Delving into a simple linear regression model
class LinearRegressor(nn.Module):
    def __init__(self):
        super(LinearRegressor, self).__init__()
        self.linear = nn.Linear(1, 1)

    def forward(self, x):
        return self.linear(x)


model = LinearRegressor()

# Let's inspect the model
for name, param in model.named_parameters():
    if param.requires_grad:
        print(name, param)

criterion = nn.MSELoss()
optimizer = optim.SGD(model.parameters(), lr=0.1)

x_train = torch.randn(10, 1)
y_train = 3 * x_train + 2

model.train()
for epoch in range(1000):
    optimizer.zero_grad()
    outputs = model(x_train)
    loss = criterion(outputs, y_train)
    loss.backward()
    optimizer.step()

model.eval()

x_test = torch.tensor([5.0])
y_test = model(x_test)

print(y_test.item())
